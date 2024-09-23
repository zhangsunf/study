package com.zhang.javaee;
/*
* final
* 类不可以继承
* 方法不可以被子类覆盖，但可以重载
* 变量赋值后不可以更改值*/


/*
* 局部内部类和匿名内部类
* 只能访问局部final变量
* 只是copy一份外部类的变量给内部类用
* */

/*
* final：关键字
* finally：用于抛异常 无论如何都执行
* finalize：垃圾回收 不能重写因为会导致内存溢出     fqueue队列 里对象是等待回收或者等待拯救 finalizer救没有回收或者曾救 一个对象只进行一次finalize
* */
//public class final_mode {
//
//    public static void main(String[] args) {
//        Person a = new Person();
//        a.finalize();
//    }
//
//
//}
//public class Person{
//    @Override
//    protected void finalize(){
//        System.out.println("销毁");
//    }
//}
