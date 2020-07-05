package potapov.sergey.part3.HW14;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Money {

    private static final Logger log = LogManager.getLogger(Money.class);

    private static int money = 0;

    private static Money moneyObj;

    private Money() {
    }

    public static int getCurrentValueOfMoney(){
        return money;
    }

    public static Money getMoneyObj() {
        if (moneyObj == null) {
            moneyObj = new Money();
        }
        return moneyObj;
    }

    public void depositMoney(int incMoney){
        money = incMoney + money;
        log.info("Внесены деньги");
    }

    public void makePurchase(int incPurchase){
        money = money - incPurchase;
        log.info("Входящая покупка");
    }

}
