package Java.thread.exercise;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/1/19
 */

class MxhThreadTest extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        MxhThreadTest mxhThreadTest = new MxhThreadTest();
        mxhThreadTest.start();
    }
}
