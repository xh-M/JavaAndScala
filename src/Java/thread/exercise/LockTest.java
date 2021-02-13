package Java.thread.exercise;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全方式三: Lock锁 ---jdk 5.0新增
 *
 * @Auther: XianghuiMeng
 * @Date: 2021/2/2
 */

class Window4 implements Runnable {

    private int ticket = 100;

    //1.实例化ReentrantLock
    private ReentrantLock reentrantLock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            try {
                //2.调用锁定方法lock()
                reentrantLock.lock();
                if (ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ": 票号为-----" + ticket );
                    ticket--;
                }else {
                    break;
                }
            } finally {
                //3.调用解锁方法unlock()
                reentrantLock.unlock();
            }
        }
    }
}
public class LockTest {
    public static void main(String[] args) {
         Window4 window4 = new Window4();
         Thread t1 = new Thread(window4);
         Thread t2 = new Thread(window4);
         Thread t3 = new Thread(window4);

         t1.setName("线程1");
         t2.setName("线程2");
         t3.setName("线程3");

         t1.start();
         t2.start();
         t3.start();



    }
}
