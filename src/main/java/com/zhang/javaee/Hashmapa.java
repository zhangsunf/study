package com.zhang.javaee;

import java.util.HashMap;

/*
* 实现原理
* 键值对存储
* 数组加链表/红黑树默认16 2倍扩容 
*变红黑树要数组大于68并且链表大于8
* hashmap内部实现entry类》hash，key，value，next
*
*
* 扩容机制
* 生成新数组 遍历copy
* 链表重写计算
* 红黑树就移动根节点
* */

//put方法
public class Hashmapa {
    HashMap a = new HashMap();
}
