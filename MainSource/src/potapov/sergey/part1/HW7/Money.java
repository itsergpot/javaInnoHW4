package potapov.sergey.part1.HW7;

public class Money {
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
    }

    public void makePurchase(int incPurchase){
        money = money - incPurchase;
    }

}
