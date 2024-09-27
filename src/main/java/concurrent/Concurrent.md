### 并发三大特性，原子性，有序性，可见性
原子性：
    操作要么都执行，要么都失败。需要同步机制。
有序性：
    需要同步机制
可见性：
    一个线程修改共享值其他线程立即知道修改。同步机制

#### 同步机制
volatile关键字
    解决：可见性，有序性
    原理：
锁
其他




















java.util.concurrent
## AQS抽象队列同步器(例同步框架如lock的底层实现)
    abstractqueuesynchronizer volatile关键字（）
        volatile int state 同步状态
            get set aompareandsetstate（CAS同步机制：内存位置，预期数值，新值）
    悲观加锁  乐观就用CAS

    获取不到锁的线程会被打包到一个线程》等待队列
                                        
    排他锁
    共享锁
    