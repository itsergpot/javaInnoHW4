package potapov.sergey.part1.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();

        System.out.println("Минимальное число - " + MinCalculate.calculateMinMethod(firstNumber, secondNumber));

        scan.close();
    }
}
