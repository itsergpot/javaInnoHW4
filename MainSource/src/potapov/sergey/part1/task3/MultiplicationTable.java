package potapov.sergey.part1.task3;

public class MultiplicationTable {
    public static void printMultiplicationTable(){
        for (int i = 1; i < 10; i++){
            do{
                System.out.println(i + " * " + Main.counter + " = " + i * Main.counter + "; ");
                Main.counter++;
            }while(Main.counter < 10);
            Main.counter = 1;
            System.out.println();
        }
    }
}
