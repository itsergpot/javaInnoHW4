package potapov.sergey.part3.HW14;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

import static potapov.sergey.part3.HW14.DisplayInfoMessages.*;

public class Choice {

    private static final Logger log = LogManager.getLogger(Choice.class);

    public void setChoice(int choice) {



        int money;
        Scanner incValueOfMoney = new Scanner(System.in);
        Money currentBill = Money.getMoneyObj();
        Scanner incDrinkChoice = new Scanner(System.in);

        switch (choice) {
            case 0:
                System.out.println("Вы выполнили выход");
                log.debug("Выполнен выход");
                System.exit(0);
                break;
            case 1:
                printAllGoods();
                defaultIncMessage();
                System.out.print("\n");
                log.debug("Выведен весь список товаров");
                break;
            case 2:
                System.out.println("Введите сумму:");
                money = incValueOfMoney.nextInt();
                currentBill.depositMoney(money);
                currentValueOfMoney();
                defaultIncMessage();
                System.out.print("\n");
                log.debug("Внесены деньги в количестве " + money + " руб");
                break;
            case 3:
                currentValueOfMoney();
                defaultIncMessage();
                System.out.print("\n");
                log.debug("Показан текущий баланс " + Money.getCurrentValueOfMoney());
                break;
            case 4:
                System.out.println("Выберите напиток:");
                printAllGoods();
                System.out.println("Чтобы отменить действие введите 0");
                outLoop: while (true) {
                    int drinkChoice = incDrinkChoice.nextInt();
                    if (drinkChoice == 0){
                        log.debug("Порядковый номер - " + drinkChoice + " не найден.");
                        break;
                    }
                    for (GoodsEnum list : GoodsEnum.values()
                    ) {
                        if (drinkChoice == list.serialNumber) {
                            if (Money.getCurrentValueOfMoney() - list.cost >= 0) {
                                currentBill.makePurchase(list.cost);
                                System.out.println("Покупка совершена.");
                                log.debug("Покупка: " + list.name + " " + "порядковый номер - " + drinkChoice + " была совршена.");
                                currentValueOfMoney();
                            } else {
                                System.out.println("На вашем счете недостаточно средств для покупки. Пополните баланс" +
                                        " счета. Текущий баланс: " + Money.getCurrentValueOfMoney() + " руб.");
                                log.debug("Покупка: " + list.name + " " + "порядковый номер - " + drinkChoice + " не была совршена, недостаточно средств.");
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
