package jvm;

public class FinalizeTest {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            Person person = new Person();
            System.out.println(person);
            System.gc();
        }
        System.gc();
    }
}
