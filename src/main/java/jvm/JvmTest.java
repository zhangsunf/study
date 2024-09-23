package jvm;
public class JvmTest {
    public static void main(String[] args){
        Person person = new Person();
        person.compute();
        System.out.println(String.class.getClassLoader());//应为是c写的所以返回null
        System.out.println(Person.class.getClassLoader());
        System.out.println(User.class.getClassLoader());
        //int a =System.in.read();
        //System.out.println(a)

    }
}
