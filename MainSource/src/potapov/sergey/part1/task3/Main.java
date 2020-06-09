package potapov.sergey.part1.task3;

import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static int counter = 1;

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++){
            do{
                System.out.println(i + " * " + counter + " = " + i * counter + "; ");
                counter++;
            }while(counter < 10);
            counter = 1;
            System.out.println();
        }


    }
}
