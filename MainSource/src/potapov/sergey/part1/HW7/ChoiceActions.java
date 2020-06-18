package potapov.sergey.part1.HW7;

import java.util.Scanner;

public class ChoiceActions {
    public void setChoice(int choice) {

        int money;
        Scanner inc_value_of_money = new Scanner(System.in);
        MoneyActions current_bill = MoneyActions.getMoneyActionsObj();
        Scanner inc_drink_choice = new Scanner(System.in);

        switch (choice) {
            case 0:
                System.out.println("Вы выполнили выход");
                System.exit(0);
                break;
            case 1:
                GoodsListEnum.printAllGoods();
                Main.defaultIncMessage();
                System.out.print("\n");
                break;
            case 2:
                System.out.println("Введите сумму:");
                money = inc_value_of_money.nextInt();
                current_bill.depositMoney(money);
                System.out.println("Текущий баланс: " + MoneyActions.getCurrentValueOfMoney() + " руб.");
                Main.defaultIncMessage();
                System.out.print("\n");
                break;
            case 3:
                System.out.println("Текущий баланс: " + MoneyActions.getCurrentValueOfMoney() + " руб.");
                Main.defaultIncMessage();
                System.out.print("\n");
                break;
            case 4:
                System.out.println("Выберите напиток:");
                GoodsListEnum.printAllGoods();
                System.out.println("Чтобы отменить действие введите 0");
                outLoop: while (true) {
                    int drink_choice = inc_drink_choice.nextInt();
                    if (drink_choice == 0){
                        break;
                    }
                    for (GoodsListEnum list : GoodsListEnum.values()
                    ) {
                        if (drink_choice == list.serial_number) {
                            if (MoneyActions.getCurrentValueOfMoney() - list.cost >= 0) {
                                current_bill.makePurchase(list.cost);
                                System.out.println("Покупка совершена.");
                                System.out.println("Текущий баланс: " + MoneyActions.getCurrentValueOfMoney() + " руб.");
                            } else {
                                System.out.println("На вашем счете недостаточно средств для покупки. Пополните баланс" +
                                        " счета. Текущий баланс: " + MoneyActions.getCurrentValueOfMoney() + " руб.");
                            }
                            break outLoop;
                        }
                    }
                    System.out.println("Напитка не найдено. Повторите ввод:");
                }
                Main.defaultIncMessage();
                break;
            default:
                Main.defaultIncMessage();
                System.out.print("\n");
        }
    }

}
