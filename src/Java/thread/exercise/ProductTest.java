package Java.thread.exercise;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/2/13
 *
 * 线程通信的应用: 生产者/消费者问题
 *
 *
 */

class Clerk {//店员

    private int productNum = 0;
    //生产产品
    public synchronized void produceProduct() {
        if(productNum < 5){
            productNum++;
            System.out.println(Thread.currentThread().getName() + ":开始生产第" + productNum + "个产品");
            //生产了一个产品就去唤醒消费者
            notify();
        }else {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    //消费产品
    public synchronized void cousumeProduct() {
        if (productNum > 0){
            System.out.println(Thread.currentThread().getName() + ":开始消费第" + productNum +"个产品");
            productNum--;
            //消费了一个产品就唤醒
            notify();
        }else {
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer extends Thread{//生产者
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":开始生产产品......");
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }

    }
}

class Consumer extends Thread{//消费者
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":开始消费产品......");
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.cousumeProduct();
        }
    }
}



public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);
        p1.setName("生产者1");

        Consumer c1 = new Consumer(clerk);
        c1.setName("消费者1");

        p1.start();
        c1.start();
    }
}
