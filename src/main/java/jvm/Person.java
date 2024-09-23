package jvm;

import java.util.Objects;

class Person {
    public static final int initDate = 1;
    public static User user = new User();

    public int compute(){
        int a = 1;
        int b = 2;
        int c = (a+b)* 10;
        return c;
    }
}
class User{
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

}