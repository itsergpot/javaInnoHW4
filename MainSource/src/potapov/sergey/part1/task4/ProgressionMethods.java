package potapov.sergey.part1.task4;

import java.util.Scanner;

public class ProgressionMethods {

    boolean choiceTrigger = true;
    double counter = 1;

    public String choiceRecognizer(int userChoice) {
        if (userChoice == 1) {
            return calculationOfArithmeticProgression();
        } else if (userChoice == 2) {
            return calculationOfGeometricProgression();
        } else if (userChoice == 0) {
            return "Вы вышли из программы.";
        } else {
            return "Вы вышли из программы.";
        }
    }

    public String calculationOfArithmeticProgression() {
        System.out.println("Арифметическая прогрессия. Введите первый член арифм. прогрессии: ");
        Scanner scan = new Scanner(System.in);
        double firstMemberOfProgression = scan.nextDouble();
        System.out.println("Введите разность прогрессии: ");
        double progressionDifference = scan.nextDouble();
        System.out.println("Введите количество членов арифметической прогрессии: ");
        double numberOfMembersOfProgression = scan.nextDouble();
        StringBuilder resultToOutput = new StringBuilder();
        resultToOutput.append("Первый элемент Арифметической прогрессии - ").append(firstMemberOfProgression).append(". Лист арифметической прогрессии для ")
                .append((int) numberOfMembersOfProgression).append(" элементов:");
        for (int i = 1; i <= numberOfMembersOfProgression; i++) {
            double resultOfCalculation = firstMemberOfProgression + progressionDifference * (counter - 1);
            resultToOutput.append(" ").append(resultOfCalculation);
            counter++;
        }
        counter = 1;
        return resultToOutput.toString();
    }

    public String calculationOfGeometricProgression() {

        System.out.println("Геометрическая прогрессия. Введите первый член геом. прогрессии: ");
        Scanner scan = new Scanner(System.in);
        double firstMemberOfProgression = scan.nextDouble();
        System.out.println("Введите знаменатель прогрессии: ");
        double denominatorOfProgression = scan.nextDouble();
        System.out.println("Введите количество членов геом. прогрессии: ");
        double numberOfMembersOfProgression = scan.nextDouble();

        StringBuilder resultToOutput = new StringBuilder();
        resultToOutput.append("Первый элемент геометрической прогрессии - ").append(firstMemberOfProgression).append(". Лист геометрической прогрессии для ")
                .append((int) numberOfMembersOfProgression).append(" элементов:");
        for (int i = 1; i <= numberOfMembersOfProgression; i++) {
            double resultOfCalculation = firstMemberOfProgression * Math.pow(denominatorOfProgression, counter - 1);
            resultToOutput.append(" ").append(resultOfCalculation);
            counter++;
        }
        counter = 1;
        return resultToOutput.toString();
    }
}


