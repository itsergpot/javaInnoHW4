package potapov.sergey.part1.HW7;

public class MoneyActions {
    private static int money = 0;

    private static MoneyActions moneyActionsObj;

    private MoneyActions() {
    }

    public static int getCurrentValueOfMoney(){
        return money;
    }

    public static MoneyActions getMoneyActionsObj() {
        if (MoneyActions.moneyActionsObj == null) {
            MoneyActions.moneyActionsObj = new MoneyActions();
        }
        return MoneyActions.moneyActionsObj;
    }

    public void depositMoney(int incMoney){
        money = incMoney + money;
    }

    public void makePurchase(int incPurchase){
        money = money - incPurchase;
    }

}
