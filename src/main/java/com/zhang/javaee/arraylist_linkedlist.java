package com.zhang.javaee;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/*arraylist
* 底层：动态数组 扩容1.5倍是copy原来数组
* 优点：随机访问性能好
* */


/*linkedlist
* 底层：双向链表(Deque 要知道数据结构) 扩容就在后面加就好了
* 优点：插入和删除性能好
* 循环必须要用 iterator
* */
public class arraylist_linkedlist {
    public static void main(String[] args) {
        LinkedList<String> a = new LinkedList<>();
        a.add("c");
        String g = "g";
        a.add(g);
        ArrayList b = new ArrayList();
        b.add("a");

        // 获取 ArrayList 的迭代器，注意这里应该是 Iterator<Integer> 类型
        Iterator<String> integer = a.iterator();
        // hasNext()方法用于判断迭代器是否还有下一个元素
        while (integer.hasNext()) {
            // next()方法用于获取下一个元素
            String value = integer.next();
            System.out.println(value);
        }

//        for (String value : a) {
//            System.out.println(value);
//        }

        System.out.println(a);
        System.out.println(b);

    }
}
//添加元素方法
//add(E e)：在列表末尾添加元素。
//addAll(Collection<? extends E> c)：将指定集合中的所有元素添加到列表末尾。
//addAll(int index, Collection<? extends E> c)：从指定位置开始，将指定集合中的所有元素添加到列表中。

//删除元素方法
//remove(int index)：删除指定索引处的元素。
//remove(Object o)：删除列表中第一次出现的指定元素。
//removeAll(Collection<?> c)：从列表中删除指定集合中包含的所有元素。
//clear()：清空列表中的所有元素。

//修改元素方法
//set(int index, E element)：用指定元素替换指定索引处的元素。

//获取元素相关方法
//get(int index)：获取指定索引处的元素。
//indexOf(Object o)：返回指定元素在列表中第一次出现的索引，若不存在则返回 -1。
//lastIndexOf(Object o)：返回指定元素在列表中最后一次出现的索引，若不存在则返回 -1。
//subList(int fromIndex, int toIndex)：返回一个从 fromIndex（包含）到 toIndex（不包含）的子列表。

//判断和查询方法
//contains(Object o)：判断列表中是否包含指定元素。
//isEmpty()：判断列表是否为空。
//size()：返回列表中元素的个数。

/////////////////////////////////////////
//添加元素方法
//add(E e)：将元素添加到链表末尾。
//addFirst(E e)：在链表头部添加元素。
//addLast(E e)：在链表尾部添加元素（和 add (E e) 效果相同，因为 LinkedList 是双向链表）。
//offer(E e)：将元素添加到链表末尾，返回true（通常用于队列操作）。
//offerFirst(E e)：在链表头部添加元素，返回true。
//offerLast(E e)：在链表尾部添加元素，返回true。

//删除元素方法
//remove()：移除并返回链表头部的元素（通常用于队列操作）。
//removeFirst()：移除并返回链表头部元素。
//removeLast()：移除并返回链表尾部元素。
//poll()：移除并返回链表头部元素，如果链表为空则返回null（通常用于队列操作）。
//pollFirst()：移除并返回链表头部元素，如果链表为空则返回null。
//pollLast()：移除并返回链表尾部元素，如果链表为空则返回null。
//remove(Object o)：从链表中移除指定元素的第一个匹配项。

//修改元素方法
//set(int index, E element)：将链表中指定位置的元素替换为指定元素。

//获取元素方法
//get(int index)：返回链表中指定位置的元素。
//getFirst()：返回链表头部元素。
//getLast()：返回链表尾部元素。
//peek()：返回链表头部元素，但不移除，如果链表为空则返回null（通常用于队列操作）。
//peekFirst()：返回链表头部元素，但不移除，如果链表为空则返回null。
//peekLast()：返回链表尾部元素，但不移除，如果链表为空则返回null。

//其他方法
//contains(Object o)：判断链表中是否包含指定元素。
//size()：返回链表中元素的数量。
//isEmpty()：判断链表是否为空。
