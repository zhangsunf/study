package threadtext;
//测试生产者消费者管程法
//缓冲区
public class TestPC {
}
class Producer extends Thread{

}
class Consumer extends Thread{

}
class Chicken {

}
class Redis{
    //容器
    Chicken[] a = new Chicken[10];
    int count = 0;
    public synchronized void push(Chicken chicken){
        //满啦就消费
        if(count == a.length){
            //通知消费者消费生产者等待
        }
        //加入产品
        a[count] = chicken;
        count++;

        //有产品通知消费者消费
    }
    public synchronized Chicken pop(){
        if(count == 0){
            //等待生产，消费者等待
        }
        count--;
        Chicken chicken = a[count];
        //吃完通知生产

        return chicken;
    }
}
