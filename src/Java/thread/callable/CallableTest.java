package Java.thread.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Auther: XianghuiMeng
 * @Date: 2020/12/5
 */

class Number implements Callable{

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}

public class CallableTest {
    public static void main(String[] args) {
        Number number = new Number();

        FutureTask futureTask = new FutureTask(number);

        new Thread(futureTask).start();

//        try {
//            Object sum = futureTask.get();
//            System.out.println(sum);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }



    }
}
