package com.zhang.javaee;
/*
*浅拷贝:拷贝数据类型 和 地址  （指向同一个对象）
*深拷贝；拷贝数据类型 和 地址 和 地址对象（指向不一样的对象）
* 堆 new Teacher(); new Student();
* 栈 teacher        student
*/
public class Copy {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("zhang");
        teacher.setAge(27);

        Student student = new Student();
        student.getName("dan");
        student.setAge(18);
        student.setTeacherName(teacher);


    }

}