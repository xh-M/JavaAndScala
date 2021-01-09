package Java.thread.exercise;

import static java.lang.Thread.sleep;

/**
 * @Auther: XianghuiMeng
 * @Date: 2020/12/4
 */

class Number implements Runnable{

    private int number = 1;
    @Override
    public void run() {

        while (true){

            synchronized (this) {
                notify();
                if (number <= 10){
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }
        }

    }
}

public class CommunicateTest {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);
        t1.setName("thread_1");
        t2.setName("thread_2");
        t1.start();
        t2.start();
    }
}
