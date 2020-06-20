package potapov.sergey.part1.HW7;

import java.util.Scanner;

import static potapov.sergey.part1.HW7.DisplayInfoMessages.*;

public class Choice {
    public void setChoice(int choice) {

        int money;
        Scanner incValueOfMoney = new Scanner(System.in);
        Money currentBill = Money.getMoneyObj();
        Scanner incDrinkChoice = new Scanner(System.in);

        switch (choice) {
            case 0:
                System.out.println("Вы выполнили выход");
                System.exit(0);
                break;
            case 1:
                printAllGoods();
                defaultIncMessage();
                System.out.print("\n");
                break;
            case 2:
                System.out.println("Введите сумму:");
                money = incValueOfMoney.nextInt();
                currentBill.depositMoney(money);
                currentValueOfMoney();
                defaultIncMessage();
                System.out.print("\n");
                break;
            case 3:
                currentValueOfMoney();
                defaultIncMessage();
                System.out.print("\n");
                break;
            case 4:
                System.out.println("Выберите напиток:");
                printAllGoods();
                System.out.println("Чтобы отменить действие введите 0");
                outLoop: while (true) {
                    int drinkChoice = incDrinkChoice.nextInt();
                    if (drinkChoice == 0){
                        break;
                    }
                    for (GoodsEnum list : GoodsEnum.values()
                    ) {
                        if (drinkChoice == list.serialNumber) {
                            if (Money.getCurrentValueOfMoney() - list.cost >= 0) {
                                currentBill.makePurchase(list.cost);
                                System.out.println("Покупка совершена.");
                                currentValueOfMoney();
                            } else {
                                System.out.println("На вашем счете недостаточно средств для покупки. Пополните баланс" +
                                        " счета. Текущий баланс: " + Money.getCurrentValueOfMoney() + " руб.");
                            }
                            break outLoop;
                        }
                    }
                    System.out.println("Напитка не найдено. Повторите ввод:");
                }
                defaultIncMessage();
                break;
            default:
                defaultIncMessage();
                System.out.print("\n");
        }
    }

}
