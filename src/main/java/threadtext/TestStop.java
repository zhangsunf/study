package threadtext;
//次数停止
//标志位
//不建议使用过时方法
public class TestStop implements Runnable {
    private  boolean flog = true;

    @Override
    public void run() {
        int i = 0;
        while (flog){
            System.out.println("exit");
        }
    }

    public void stop(){
        this.flog = false;
    }

    public static void main(String[] args) {
        TestStop a = new TestStop();
        new Thread(a).start();
//        Thread a1 = new Thread(a);
//        Thread a2 = new Thread(a);
//        a1.start();
//        a2.start();
        for (int i = 0;i<10;i++){
            System.out.println("MIAN");
            if(i==9){
                a.stop();
            }
        }
    }
}
