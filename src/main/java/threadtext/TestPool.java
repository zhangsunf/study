package threadtext;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPool {
    public static void main(String[] args) {
        //创建线程池
        //池大小
        ExecutorService service = Executors.newFixedThreadPool(10);
        //执行
        a(service);
        a(service);

        //关闭
        service.shutdown();

    }

    private static void a(ExecutorService service) {
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
    }
}
class  MyThread implements Runnable{


    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}