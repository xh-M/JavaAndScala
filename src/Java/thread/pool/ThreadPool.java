package Java.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Auther: XianghuiMeng
 * @Date: 2021/2/13
 */

class ThreadPoolTest implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {

        //1.提供指定数量的线程池
        ThreadPoolExecutor service = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        //2.执行指定的线程操作. 需要提供实现 Runnable接口 或Callable接口的对象
        service.execute(new ThreadPoolTest());//适用于Runnable接口
//        service.submit(Callable callable);  //适用于Callable接口
        //关闭连接池
        service.shutdown();
    }
}
