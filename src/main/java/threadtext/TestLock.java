package threadtext;

public class TestLock {
    public static void main(String[] args) {
        Makeup a = new Makeup(0,"我");
        Makeup b = new Makeup(1,"你");
        a.start();
        b.start();

    }
}
//口红
class Lipstick{

}
//镜子
class Mirror{

}
class Makeup extends Thread{
    static Lipstick lipstick = new Lipstick();
    static  Mirror mirror = new Mirror();
    int choice;//选择
    String girlName;
    Makeup(int choice,String girlName){
        this.choice = choice;
        this.girlName = girlName;
    }
    @Override
    public void run() {
        //化妆
        try {
            makeup();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    //化妆方法制造互持
    private void makeup() throws InterruptedException {
        if(choice == 0){
            synchronized (lipstick){
                System.out.println(this.girlName + "获取口红锁");
                Thread.sleep(1000);
                synchronized (mirror){
                    System.out.println(this.girlName+"获取镜子锁");

                }
            }
        }else {
            synchronized (mirror){
                System.out.println(this.girlName + "获取镜子锁");
                Thread.sleep(1000);
                synchronized (lipstick){
                    System.out.println(this.girlName+"获取口红锁");

                }
            }
        }
    }
//    private void makeup() throws InterruptedException {
//        if(choice == 0){
//            synchronized (lipstick){
//                System.out.println(this.girlName + "获取口红锁");
//                Thread.sleep(1000);
//                }
//            }
//            synchronized (mirror){
//                System.out.println(this.girlName+"获取镜子锁");
//        }else {
//            synchronized (mirror){
//                System.out.println(this.girlName + "获取镜子锁");
//                Thread.sleep(1000);
//
//            }
//            synchronized (lipstick){
//                System.out.println(this.girlName+"获取口红锁");
//
//            }
//        }
//    }
}
