package potapov.sergey.part1.HW7;

public class DisplayInfoMessages {

    public static void defaultIncMessage(){
        System.out.println("Нажмите 1 - чтобы посмотреть список товаров, 2 - внести деньги на счет," +
                " 3 - текущий баланс, " + "4 - совершить покупку, " + "0 - завершить работу с автоматом");
    }

    public static void printAllGoods(){
        for (GoodsEnum list: GoodsEnum.values()
        ) {
            System.out.println(list.name + " - " + list.cost + " рублей." +
                    " Порядковый номер: " + list.serialNumber);
        }
    }

    public static void currentValueOfMoney() {
        System.out.println("Текущий баланс: " + Money.getCurrentValueOfMoney() + " руб.");
    }
}
