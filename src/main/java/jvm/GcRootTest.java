package jvm;

public class GcRootTest {
    public static int a = 1;
    public static User user = new User();
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1);
        user1.setName("aaa");
    }
}
