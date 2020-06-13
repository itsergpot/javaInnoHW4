package potapov.sergey.part1.task2;

public class NumberRecognizer {

    public static String isOdd(int incNumber) {
        if (incNumber % 2 != 0) {
            return "нечетное";
        } else {
            return "четное";
        }
    }

    public static String isNegative(int incNumber) {
        if (incNumber < 0) {
            return "отрицательное";
        } else if (incNumber > 0){
            return "положительное";
        } else {
            return "нулевое";
        }
    }

    public static void printResultOfRecognizer(int number) {
        System.out.println("Число " + isOdd(number) + ", " + isNegative(number) + ".");
    }
}
