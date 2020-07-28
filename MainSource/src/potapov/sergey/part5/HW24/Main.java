package potapov.sergey.part5.HW24;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("foo");
        stringSet.add("buzz");
        stringSet.add("bar");
        stringSet.add("fork");
        stringSet.add("bort");
        stringSet.add("spoon");
        stringSet.add("!");
        stringSet.add("dude");
        System.out.println(stringSet);
        System.out.println(removeEvenLength(stringSet));
    }

    public static Set<String> removeEvenLength(Set<String> set) {
        set.removeIf(tmp -> (tmp.length() % 2 == 0));
        return set;
    }
}
