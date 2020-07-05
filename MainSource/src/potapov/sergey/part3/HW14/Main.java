package potapov.sergey.part3.HW14;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static potapov.sergey.part3.HW14.DisplayInfoMessages.defaultIncMessage;

public class Main {

    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        defaultIncMessage();
        Choice choice = new Choice();
        Scanner scan = new Scanner(System.in);

        //endless cycle of users` incoming values
        try {
            while (true) {
                int incCode = scan.nextInt();
                choice.setChoice(incCode);
            }
        } catch (Exception ex) {
            log.fatal("Некорректное входящее значение", ex);
        }
    }
}
