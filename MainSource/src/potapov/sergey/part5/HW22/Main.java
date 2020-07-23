package potapov.sergey.part5.HW22;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(12, "Sasha");
        Person person2 = new Person(33,"Sasha");
        Person person3 = new Person(15,"Sasha");
        Person person4 = new Person(5,"Sasha");
        Person person5 = new Person(8,"Aleksey");
        Person person6 = new Person(66,"Aleksey");
        Person person7 = new Person(45,"Aleksey");
        Person person8 = new Person(25,"Aleksey");


        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);


        System.out.println("Before Sorting:\n");
        for (Person person : persons) {
            System.out.println(person.toString());
        }

        System.out.println();
        persons.sort(new PersonSuperComparator());

        System.out.println("After Sorting:\n");
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
