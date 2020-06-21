package potapov.sergey.part2.HW8.task1;


import static potapov.sergey.part2.HW8.task1.Calculator.*;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(1,2,30);
        System.out.println(calculator.value1 + " + " + calculator.value2 + " = " + addition(calculator));
        System.out.println(calculator.value1 + " * " + calculator.value2 + " = " + multiplication(calculator));
        System.out.println(calculator.value1 + " - " + calculator.value2 + " = " + subtraction(calculator));
        System.out.println(calculator.value1 + " / " + calculator.value2 + " = " + division(calculator));
        System.out.println(calculator.value1 + " % " + calculator.percantage + " = " + percentageOfNumber(calculator));
        
    }
}
