package Java.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建线程的方式四: 使用线程池
 *
 * @Auther: XianghuiMeng
 * @Date: 2020/12/5
 */

class NumberThread implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);

        service.execute(new NumberThread());//适用于Runnable
        
//        service.submit();//适用于Callable
        service.shutdown();
    }
}
