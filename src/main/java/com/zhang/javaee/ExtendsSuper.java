package com.zhang.javaee;

import java.util.ArrayList;
import java.util.List;

//extends和super
//<?extends T>表示包括T在内的任何T的子类
//<?super T>表示T在内的任何父类
public class ExtendsSuper {
}
class Food{
    String name = "Food";

}
class Fruit extends Food{
    String name = "Fruit";
}
class Apple extends Fruit{
    String name = "Apple";
}
class ExtendsTest{
    List<? extends Fruit> list;
    public void set(){
        list = new ArrayList<Fruit>();//可以
        list = new ArrayList<Apple>();//可以
        //list = new ArrayList<Food>();//报错
    }
}
class SuperTest{
    List<? super Fruit> list;
    public void set(){
        list = new ArrayList<Fruit>();//可以
        //list = new ArrayList<Apple>();//错误
        list = new ArrayList<Food>();//可以
    }
}

