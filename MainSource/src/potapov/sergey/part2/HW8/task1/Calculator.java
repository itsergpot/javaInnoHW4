package potapov.sergey.part2.HW8.task1;

public class Calculator {

    double value1, value2, percantage;

    Calculator(int value1, int value2, double percantage){
        this.value1 = value1;
        this.value2 = value2;
        this.percantage = percantage;
    }

    public static double subtraction(Calculator obj){
        return obj.value1 - obj.value2;
    }

    public static double multiplication(Calculator obj){
        return obj.value2 * obj.value1;
    }

    public static double addition(Calculator obj){
        return obj.value1 + obj.value2;
    }

    public static double division(Calculator obj){
        try{
            return obj.value1 / obj.value2;
        }
        catch (ArithmeticException ex){
            System.out.println();
            return 0;
        }
    }

    public static double percentageOfNumber(Calculator obj){
        return obj.value1 * (obj.percantage / 100);
    }

}
