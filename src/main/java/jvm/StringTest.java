package jvm;

public class StringTest {
    static void redo(){
        redo();
    }
    public static void main(String[] args) {
        //redo();
        String a = "a";
        String b = "b";
        String c = "ab";
        String d = "a"+"b";//在字符串常量池
        String e = a+b;//在堆里因为toString返回new
        String f = a + "b";
        String g = "a" + b;

        int p =2147483647;
        System.out.println(p);
        for (int i = 0; i <10; i++) {
            p++;
            System.out.println(p);
        }
        while (true);

    }
}
