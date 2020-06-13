package potapov.sergey.part1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        NumberRecognizer.printResultOfRecognizer(number);
        scan.close();
    }
}
