package potapov.sergey.part2.HW8.task3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int numberOfDoc = 1;
        Date currentDate = new Date();
        String[] arrayOfGoods = new String[10];
        for (int i = 0; i < 10; i++) {
            arrayOfGoods[i] = i + "test";
        }
        Contract contract1 = new Contract(numberOfDoc, currentDate, arrayOfGoods);
        Act act1 = Conversion.conversionFromContractToAct(contract1);
        System.out.println("Act - " + act1.numberOfDoc + ", " + act1.date.toString());
        for (String act: act1.productList
             ) {
            System.out.println(act);
        }
    }
}
