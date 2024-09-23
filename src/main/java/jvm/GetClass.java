package jvm;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetClass {
    public static void main(String[] args) throws NoSuchMethodException {
        Person person = new Person();
        person.compute();
        Class<Person> c = Person.class;
        System.out.println(person.getClass());
        Field[] fields = c.getFields();
        for (Field b:fields) {
            System.out.println(b);
        }
        Field[] a = c.getDeclaredFields();
        for (Field b:a) {
            System.out.println(b);
        }
        Method d = c.getMethod("compute",Person.class);
        System.out.println(d);

    }
}
