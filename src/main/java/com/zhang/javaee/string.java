package com.zhang.javaee;
/*
* 学习
* string 不可变
* stringbuffer 可变 线程安全（在源码加了锁syncheonized（确保同一时间只有一个线程操作这个方法）） 源码是有一个char类型的数组append方法
* stringbuilder 可变
* 知识点字符串常量池（在堆里面 会检查池里面有没有同样的数据)
* String = a;//是地址指向字符串常量池
* 效率stringbuilder 》 stringbuffer 》 string
* */
public class string {
    public static void main(String[] args) {
        String a = "a";//数据在字符串常量池
        System.out.println(a.hashCode());
        a = "ab";//在常量池中创建新对象改指向地址
        System.out.println(a.hashCode());

        String a2 = new String("b");//是对象在堆里
        System.out.println(a2.hashCode());
        a2 = "v";
        System.out.println(a2.hashCode());

        StringBuffer b = new StringBuffer();
        System.out.println(b.hashCode());
        b.append("b");//有synchronized关键字
        System.out.println(b.hashCode());

        StringBuilder c = new StringBuilder("b");
        c.append("b");
        System.out.println(c.hashCode());
    }
}
