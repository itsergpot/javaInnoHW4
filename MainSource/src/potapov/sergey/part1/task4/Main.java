package potapov.sergey.part1.task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int userChoice;
        boolean choiceTrigger;
        double counter = 1;

        System.out.println("Вывод арифметической или геометрической прогрессии для N чисел.");

        do {
            System.out.println("Арифм. прогрессия = 1, Геометр. прогрессия = 2, выход = 0");
            Scanner incCode = new Scanner(System.in);
            userChoice = incCode.nextInt();
            if(userChoice == 1){

                System.out.println("Арифметическая прогрессия. Введите первый член арифм. прогрессии: ");
                Scanner scan = new Scanner(System.in);
                double firstMemberOfProgression = scan.nextDouble();
                System.out.println("Введите разность прогрессии: ");
                double progressionDifference = scan.nextDouble();
                System.out.println("Введите количество членов арифметической прогрессии: ");
                double numberOfMembersOfProgression = scan.nextDouble();

                ArrayList list = new ArrayList();

                for (int i = 1; i <= numberOfMembersOfProgression; i++){
                    double result = firstMemberOfProgression + progressionDifference * (counter - 1);
                    list.add(result);
                    counter++;
                }

                System.out.println("Первый элемент арифметической прогрессии - " + firstMemberOfProgression + ". Лист арифметичексой прогрессии для " + (int) numberOfMembersOfProgression
                        + " элементов: ");
                for (Object element : list){
                    System.out.println(element + " ");
                }

                scan.close();
                choiceTrigger = false;

            } else if (userChoice == 2){

                System.out.println("Геометрическая прогрессия. Введите первый член геом. прогрессии: ");
                Scanner scan = new Scanner(System.in);
                double firstMemberOfProgression = scan.nextDouble();
                System.out.println("Введите знаменатель прогрессии: ");
                double denominatorOfProgression = scan.nextDouble();
                System.out.println("Введите количество членов геом. прогрессии: ");
                double numberOfMembersOfProgression = scan.nextDouble();

                ArrayList list = new ArrayList();

                for (int i = 1; i <= numberOfMembersOfProgression; i++){
                    double result = firstMemberOfProgression * Math.pow(denominatorOfProgression, counter - 1);
                    list.add(result);
                    counter++;
                }

                System.out.println("Первый элемент геометрической прогрессии - " + firstMemberOfProgression + ". Лист геометрической прогрессии для " + (int) numberOfMembersOfProgression +
                        " элементов: ");
                for (Object element : list){
                    System.out.println(element + " ");
                }

                scan.close();
                choiceTrigger = false;

            } else if (userChoice == 0){
                System.out.println("Вы вышли из программы");
                break;
            } else {
                break;
            }

        }while(choiceTrigger);









    }

}
