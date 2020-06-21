package potapov.sergey.part2.HW8.task1;

public class Calculator {

    public static double subtraction(int value1, int value2){
        return value1 - value2;
    }

    public static double multiplication(int value1, int value2){
        return value1 * value2;
    }

    public static double addition(int value1, int value2){
        return value1 + value2;
    }

    public static double division(int value1, int value2){
        try{
            return (double) value1 / value2;
        }
        catch (ArithmeticException ex){
            System.out.println();
            return 0;
        }
    }

    public static double percentageOfNumber(int value1, int percantage){
        return value1 * ((double) percantage / 100);
    }

    public static double subtraction(double value1, double value2){
        return value1 - value2;
    }

    public static double multiplication(double value1, double value2){
        return value1 * value2;
    }

    public static double addition(double value1, double value2){
        return value1 + value2;
    }

    public static double division(double value1, double value2){
        try{
            return value1 / value2;
        }
        catch (ArithmeticException ex){
            System.out.println();
            return 0;
        }
    }

    public static double percentageOfNumber(double value1, double percantage){
        return value1 * (percantage / 100);
    }



}
