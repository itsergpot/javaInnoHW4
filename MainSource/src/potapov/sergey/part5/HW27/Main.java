package potapov.sergey.part5.HW27;

public class Main {

    public static void main(String[] args) {

        recursiveFibPrinter(20);
        System.out.printf("%n");
        System.out.println("---------------------------------------------------------------");
        simpleFib(20);

    }

    public static long recursiveFib(long incValue) {
        if (incValue <= 1) {
            return incValue;
        }
        return recursiveFib(incValue - 1) + recursiveFib(incValue - 2);
    }

    public static void recursiveFibPrinter(int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",recursiveFib(i));
        }
    }

    private static void simpleFib(int n) {
        int value0 = 0;
        int value1 = 1;
        int tmpValue;
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", value0);
            tmpValue = value1;
            value1 += value0;
            value0 = tmpValue;
        }
    }
}
