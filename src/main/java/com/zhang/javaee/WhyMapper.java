package com.zhang.javaee;
/*
* 前提了解，内在机制，jvm内存模型  加载类信息》方法区   对象数据在》堆（Class<WhyMapper> whymapperClassr）
* 把类的组成部分分解
* 类封装》》class对象Class<WhyMapper> whymapperClassr
* 成员变量》field
* 构造方法》constructor
* 成员方法》method
* 为了操作和解耦（垃圾人的自己就看看就好）
* */
public class WhyMapper {
    int a;

    public WhyMapper(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
class Main{
    public static void main(String[] args) throws ClassNotFoundException {
        WhyMapper whyMapper = new WhyMapper(5);

        Class<? extends WhyMapper> aClass =whyMapper.getClass();
        System.out.println(aClass);
    }
}
