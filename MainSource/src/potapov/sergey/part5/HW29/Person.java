package potapov.sergey.part5.HW29;

import java.util.Objects;

public class Person {
    int age;
    String surname;
    String sex;

    public Person(int age, String surname, String sex) {
        this.age = age;
        this.surname = surname;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getSurname(), person.getSurname()) &&
                Objects.equals(getSex(), person.getSex());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getSurname(), getSex());
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", surname='" + surname + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
