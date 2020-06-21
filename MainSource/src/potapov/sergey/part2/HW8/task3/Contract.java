package potapov.sergey.part2.HW8.task3;

import java.util.Date;

public class Contract {

    int numberOfDoc;
    Date date;
    String[] productList;

    Contract(int numberOfDoc, Date date, String[] productList){
        this.numberOfDoc = numberOfDoc;
        this.date = date;
        this.productList = productList;
    }
}
