package potapov.sergey.part5.HW30;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String test = "total";
        firstNonRepeatingCharacter(test);
        String test1 = "teter";
        firstNonRepeatingCharacter(test1);
        String test2 = "";
        firstNonRepeatingCharacter(test2);
        String test3 = "tete";
        firstNonRepeatingCharacter(test3);
        String test4 = "hhhhhoooooppppppjkkkk";
        firstNonRepeatingCharacter(test4);
    }

    public static Character firstNonRepeatingCharacter(String incString) {

        if (incString.length() == 0) {
            System.out.println("передана пустая строка");
            return null;
        } else {
            Map<Character, Integer> map = new LinkedHashMap<>();

            for (int i = 0; i < incString.length(); i++) {
                if (map.containsKey(incString.charAt(i))) {
                    map.put(incString.charAt(i), map.get(incString.charAt(i)) + 1);
                } else {
                    map.put(incString.charAt(i), 1);
                }
            }
            System.out.println(map);
            for (Map.Entry<Character, Integer> resultMap : map.entrySet()) {
                if (resultMap.getValue() == 1) {
                    System.out.println("первый неповторяющийся символ в слове " + incString + " равен " + resultMap.getKey());
                    return resultMap.getKey();
                }
            }
        }
        System.out.println("первый неповторяющийся символ в слове " + incString + " не найден");
        return null;
    }
}
