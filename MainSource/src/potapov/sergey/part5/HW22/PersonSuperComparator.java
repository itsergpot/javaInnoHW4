package potapov.sergey.part5.HW22;

import java.util.Comparator;

public class PersonSuperComparator implements Comparator<Person> {


    @Override
    public int compare(Person person1, Person person2) {
        int namesCompare = person1.getName().compareTo(person2.getName());
        int ageCompare = person1.getAge() - person2.getAge();

        if (namesCompare == 0) {
            return ageCompare;
        }
        return namesCompare;
    }
}
