package potapov.sergey.part1.HW4.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Вывод арифметической или геометрической прогрессии для N чисел.");
        ProgressionMethods method = new ProgressionMethods();
        do {
            System.out.println("Арифм. прогрессия = 1, Геометр. прогрессия = 2, выход = 0");
            try {
                Scanner incCode = new Scanner(System.in);
                int userChoice = incCode.nextInt();
                System.out.println(method.choiceRecognizer(userChoice));
            } catch (Exception ex) {
                System.out.println("Вы вышли из программы.");
            }
        } while (method.choiceTrigger);

    }

}
