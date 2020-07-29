package potapov.sergey.part5.HW25.task1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Вася","Иванов");
        map.put("Петр","Петров");
        map.put("Виктор","Сидоров");
        map.put("Сергей","Савельев");
        map.put("Вадим","Викторов");
        System.out.println(isUnique(map));

        Map<String, String> map2 = new HashMap<>();
        map2.put("Вася","Иванов");
        map2.put("Петр","Петров");
        map2.put("Виктор","Иванов");
        map2.put("Сергей","Савельев");
        map2.put("Вадим","Петров");
        System.out.println(isUnique(map2));
    }

    public static boolean isUnique(Map<String, String> map) {
        Set<String> valueSet = new HashSet<>(map.values());
        System.out.println(valueSet);
        if (map.isEmpty()) {
            return true;
        }

        return map.values().size() == valueSet.size();
    }
}
