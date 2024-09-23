package com.zhang.javaee;

public class stringBuffer {
    public static void main(String[] args) throws InterruptedException {
        //线程安全测试
        StringBuffer a = new StringBuffer();
        //5000线程
        for (int i = 0; i < 5000; i++) {
            new Thread(()->a.append("o")).start();
        }
        Thread.sleep(5000);
        System.out.println(a.length());

        //线程安全测试
        StringBuilder b = new StringBuilder();
        //5000线程
        for (int i = 0; i < 9000; i++) {
            new Thread(()->b.append("o")).start();
        }
        Thread.sleep(3000);
        System.out.println(b.length());
    }
}
