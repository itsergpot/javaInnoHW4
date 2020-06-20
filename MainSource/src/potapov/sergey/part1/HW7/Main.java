package potapov.sergey.part1.HW7;

import java.util.Scanner;

import static potapov.sergey.part1.HW7.DisplayInfoMessages.*;

public class Main {
    public static void main(String[] args) {

        defaultIncMessage();
        Choice choice = new Choice();
        Scanner scan = new Scanner(System.in);

        //endless cycle of users` incoming values
        try {
            while (true) {
                int incCode = scan.nextInt();
                choice.setChoice(incCode);
            }
        } catch (Exception ex) {

        }
    }
}
