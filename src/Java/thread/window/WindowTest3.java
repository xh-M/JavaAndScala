package Java.thread.window;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/1/29
 * 使用同步方法解Runnable接口线程安全问题
 */

class Windows3 implements Runnable{

    private int ticket = 20;

    @Override
    public void run() {
        while(true) {
            show();
        }
    }

    private synchronized void show(){
//        synchronized(this){
            if(ticket > 0){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "卖票: 票号为:" + ticket);
                ticket--;
            }
//        }
    }
}

public class WindowTest3 {
    public static void main(String[] args) {
        Windows3 windows3 = new Windows3();
        Thread thread1 = new Thread(windows3);
        Thread thread2 = new Thread(windows3);
        Thread thread3 = new Thread(windows3);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
