package threadtext;
//sleep模拟网络延迟
//每一个对象都有锁sleep不释放锁
public class TestSleep implements Runnable {

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        TestSleep a = new TestSleep();
        new Thread(a).start();
    }
}

//public class TestSleep implements Runnable {
//
//    @Override
//    public void run() {
//
//    }
//
//    public static void main(String[] args) {
//
//    }
//}