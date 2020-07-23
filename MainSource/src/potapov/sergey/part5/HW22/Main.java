package potapov.sergey.part5.HW22;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(12, "Kumar");
        Person person2 = new Person(33,"Gupta");
        Person person3 = new Person(15,"Kumar");


        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);


        System.out.println("Before Sorting:\n");
        for (Person person : persons) {
            System.out.println(person.getName() + " " + person.age);
        }

        persons.sort(new PersonSuperComparator());

        System.out.println("After Sorting:\n");
        for (Person person : persons) {
            System.out.println(person.getName() + " " + person.age);
        }
    }
}
