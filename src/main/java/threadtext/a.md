线程六大状态 new创建  start就绪 运行（线程体在run中） 阻塞 等待 死亡(不能再次启动) 

Thread.yield();//线程礼让让不一定成功
Thread.sleep();//线程休眠
Thread.join();//插队执行完再执行其他线程
Thread.state state = a.getState;线程状态
中止采用计数或者标志位

线程优先级1到10方法看源码的  主要还是看cpu调用 默认5 
先设置优先级再启动a.start();
a.getPriority(1);
a.setPriority(Thread.MM源码静态变量);

守护（daemon）线程
线程分为用户线程和 守护线程 
用户线程（例如mian）jvm必须要保证执行完
守护线程gc线程保护程序执行
a.setDaemon(true);//默认用户false

同步线程（多线程操作同一个资源）并发（安全）
队列（排队） 对象等待池
队列（排队）和锁（厕所上锁）
synchronized（对象的锁   排他锁）
问题
降低性能
优先级问题性能倒置
同步方法
public synchronized void method(int args){}
每个对象都有一个锁synchronize就是要拿锁才能用对象
//在方法上加锁的是this本身反射class
//同步块synchronized（Obj）{}OBJ推荐使用共享资源作为同步监视器对象（增删改查的）

juc安全类型

死锁
俩对象等待同一个资源才能运行
a > b
b > a
一个代码块拥有两个对象极有可能发生
产生死锁的4个条件
1互斥条件；一个一元
2请求与保持条件；资源不放
3不剥夺条件；
4循环等待

synchronized(隐式自动)和Lock（显示手动）
ReentrantLock可重入锁
//定义Lock锁
private final ReentrantLock lock = new ReentrantLock();
try{
    lock.lock;//加锁
    代码
}finally{
    lock.nulock();//解锁
}

线程通信
生产者消费者模式  是个问题
producer》数据缓冲区》consumer
object类里 只能在同步方法和同步代码快使用
wait();//表示线程在等待直到其他线程通知和sleep不同会释放锁
wait(long timeout);//等待时间
notify();//唤醒等待状态线程
notifyAll();//唤醒同一个对象全部wait()方法的线程，按照优先级唤醒
管程法（缓冲区）和信号灯法（标志位）
线程池

线程池（背景因为经常创建和销毁所以要提前创建线程）
线程池的大小corePoolSize;
线程池的最大线程数maximumPoolSize;
线程池的没有用时什么时候销毁keepAliveTime;
线程池接口ExecutorService
子类ThreadPoolExecutor
    void execute(Runnable command);执行runnable没有返回值
    <T> Future<T> submit(Callable<T> task);执行Callable有返回值
    void shutdown();关闭线程池
Executors;工具类,线程池工厂类，用于创建并返回不同类型的线程池




