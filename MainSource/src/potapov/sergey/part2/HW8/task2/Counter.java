package potapov.sergey.part2.HW8.task2;

public class Counter {

    public static int objCounter = 0;

    Counter(){
        objCounter++;
    }

    public static void getCounter(){
        System.out.println("Current count of Obj: " + objCounter);
    }
}
