package threadtext;
public class TestSyn  {
    public static void main(String[] args) {
        BuyTestSyn buyTestSyn = new BuyTestSyn();
        new Thread(buyTestSyn,"苦逼").start();
        new Thread(buyTestSyn,"n").start();
        new Thread(buyTestSyn,"t").start();
    }
}
//安全买票
 class BuyTestSyn implements Runnable{
    int ticket = 10;
    boolean flag = true;
    @Override
    public void run() {
        //买票
        while (flag){
            buy();
        }
    }
    private void buy(){
        if(ticket==0){
            flag = false;
            return;
        }
        ticket--;
        System.out.println(Thread.currentThread().getName()+ticket);
    }
}
