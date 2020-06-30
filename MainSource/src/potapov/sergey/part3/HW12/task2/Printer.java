package potapov.sergey.part3.HW12.task2;

public class Printer {

    String[] arr;

    public Printer(){
        this.arr = arrayCreator();
    }

    public static String[] arrayCreator() {
        String[] arr = new String[1];
        arr[0] = "Hello, World!";
        return arr;
    }
}
