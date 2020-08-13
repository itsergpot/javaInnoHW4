package potapov.sergey.part5.HW31;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {

        String tmp = "12321";
        System.out.println(tmp);
        System.out.println("palindromeChecker " + palindromeChecker(tmp));
        System.out.println("palindromeCheckerViaMoveBothSides " + palindromeCheckerViaMoveBothSides(tmp));
        System.out.println();
        String tmp1 = "мадам";
        System.out.println(tmp1);
        System.out.println("palindromeChecker " + palindromeChecker(tmp1));
        System.out.println("palindromeCheckerViaMoveBothSides " + palindromeCheckerViaMoveBothSides(tmp1));
        System.out.println();
        String tmp2 = "мадама";
        System.out.println(tmp2);
        System.out.println("palindromeChecker " + palindromeChecker(tmp2));
        System.out.println("palindromeCheckerViaMoveBothSides " + palindromeCheckerViaMoveBothSides(tmp2));
        System.out.println();
        String tmp3 = "не полиндром";
        System.out.println(tmp3);
        System.out.println("palindromeChecker " + palindromeChecker(tmp3));
        System.out.println("palindromeCheckerViaMoveBothSides " + palindromeCheckerViaMoveBothSides(tmp3));

    }

    public static boolean palindromeChecker(String incString) {
        return incString.equals((new StringBuilder(incString)).reverse().toString());
    }

    public static boolean palindromeCheckerViaMoveBothSides(String incString) {
        for (int i = 0; i < incString.length() / 2; ++i)
            if (incString.charAt(i) != incString.charAt(incString.length() - i - 1)) {
                return false;
            }
        return true;
    }
}
