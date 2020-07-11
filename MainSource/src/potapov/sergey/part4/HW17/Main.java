package potapov.sergey.part4.HW17;

public class Main {
    public static void main(String[] args) {
        System.out.println("Подгрузка локальной библиотеки library");
        Lib lib = new Lib();
        lib.loadBookLib("library");
        System.out.println();
        Displayer.mainMenu();
        Choicer.choice(lib);
    }
}
