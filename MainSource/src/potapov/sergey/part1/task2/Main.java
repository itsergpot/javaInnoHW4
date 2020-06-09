package potapov.sergey.part1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number > 0 && number % 2 == 0){
            System.out.println("Число четное и положительное");
        } else if (number < 0 && number % 2 != 0){
            System.out.println("Число нечетное и отрицательное");
        } else if (number > 0 && number % 2 != 0){
            System.out.println("Число нечетное и положительное");
        } else if (number < 0 && number % 2 == 0){
            System.out.println("Число четное и отрицательное");
        } else if (number == 0){
            System.out.println("Число четное");
        } else {
            System.out.println("Не число");
        }
        scan.close();
    }
}
