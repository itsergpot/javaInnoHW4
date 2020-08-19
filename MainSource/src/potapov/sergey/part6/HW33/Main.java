package potapov.sergey.part6.HW33;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        maxCharacter("This is test message");
    }

    public static void maxCharacter(String incString) {

        if (incString.length() == 0) {
            System.out.println("Empty string");
        } else {
            Map<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < incString.length(); i++) {
                if (incString.charAt(i) != ' ') {
                    if (map.containsKey(incString.charAt(i))) {
                        map.put(incString.charAt(i), map.get(incString.charAt(i)) + 1);
                    } else {
                        map.put(incString.charAt(i), 1);
                    }
                }
            }
            System.out.println(map);
            int maxValueInMap = Collections.max(map.values());
            for (Map.Entry<Character, Integer> resultMapElement : map.entrySet()) {
                if (resultMapElement.getValue() == maxValueInMap) {
                    System.out.println("Character: " + "\"" + resultMapElement.getKey() + "\"" + " has occurred maximum times in String: "
                            + resultMapElement.getValue());
                }

            }
        }
    }
}
