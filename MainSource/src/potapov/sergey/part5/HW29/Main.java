package potapov.sergey.part5.HW29;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Map<String, Person> map = createMap();
        System.out.println(map);
        removeTheDuplicates(map);
        System.out.println(map);
    }

    public static Map<String, Person> createMap() {
        Map<String, Person> book = new HashMap<>();
        Person person1 = new Person(29, "Петрова", "жен");
        Person person2 = new Person(34, "Сидорова", "жен");
        Person person3 = new Person(34, "Тихонова", "жен");
        Person person4 = new Person(35, "Петров", "муж");
        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person4);
        return book;
    }

    public static void removeTheDuplicates(Map<String, Person> map) {
        HashMap<Person, Integer> counters = new HashMap<>();
        for (Map.Entry<String, Person> pair : map.entrySet()) {
            counters.put(pair.getValue(), counters.getOrDefault(pair.getValue(), 0) + 1);
        }
        for (Map.Entry<Person, Integer> pair : counters.entrySet()) {
            if (pair.getValue() > 1) {
                removeItemFromMapByValue(map, pair.getKey());
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, Person> map, Person value) {
        Map<String, Person> copy = new HashMap<>(map);
        int count = 0;
        for (Map.Entry<String, Person> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                count++;
                if (count > 1) {
                    map.remove(pair.getKey());
                }
            }
        }
    }
}
