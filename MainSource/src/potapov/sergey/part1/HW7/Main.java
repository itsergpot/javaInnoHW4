package potapov.sergey.part1.HW7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.defaultIncMessage();
        ChoiceActions choice = new ChoiceActions();
        Scanner scan = new Scanner(System.in);


        //endless cycle of users` incoming values
        try {
            while (true) {
                int incCode = scan.nextInt();
                choice.setChoice(incCode);
            }
        } catch (Exception ex){

        }
    }

    public static void defaultIncMessage(){
        System.out.println("Нажмите 1 - чтобы посмотреть список товаров, 2 - внести деньги на счет," +
                " 3 - текущий баланс, " + "4 - совершить покупку, " + "0 - завершить работу с автоматом");
    }
}
