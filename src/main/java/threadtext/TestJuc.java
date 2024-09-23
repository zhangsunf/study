package threadtext;

import java.util.concurrent.CopyOnWriteArrayList;

//测试juc安全类型的集合并发编程
public class TestJuc {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
    }
}
