package threadtext;

public class TestGodThread {
    public static void main(String[] args){
        God god = new God();
        You you = new You();
        Thread a = new Thread(god);
        a.setDaemon(true);//默认用户
        a.start();
        new Thread(you).start();
    }
}
 class God implements Runnable{

    @Override
    public void run() {
        while(true){
            System.out.println("我才是上帝");
        }
    }
}
 class You implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(i+"你好");
        }
        System.out.println("再见word");
    }
}