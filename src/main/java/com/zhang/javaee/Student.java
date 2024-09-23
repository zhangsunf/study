package com.zhang.javaee;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private Teacher teacherName;

    public Student(String name, int age, Teacher teacherName) {
        this.name = name;
        this.age = age;
        this.teacherName = teacherName;
    }

    public Student() {

    }

    public String getName(String dan) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name == student.name && age == student.age && Objects.equals(teacherName, student.teacherName);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(Teacher teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, teacherName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", age=" + age +
                ", teacherName=" + teacherName +
                '}';
    }
}
