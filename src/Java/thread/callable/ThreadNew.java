package Java.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程方式三: 实现 Callable 接口 --- jdk 5.0新增
 *
 * @Auther: XianghuiMeng
 * @Date: 2021/2/13
 */

class NumberThread implements Callable{

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}

public class ThreadNew {
    public static void main(String[] args) {

       NumberThread numberThread = new NumberThread();
        FutureTask futureTask = new FutureTask(numberThread);
        new Thread(futureTask).start();

        try {
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
