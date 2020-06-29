package potapov.sergey.part3.HW9.task3;

public class Swimmer extends Human {
    @Override
    public void run() {
        System.out.println("Пловец бежит");
    }

    @Override
    public void swim() {
        System.out.println("Пловец плывет");
    }

    @Override
    public void marapthonRun() {
        System.out.println("Пловец очень плох в марафонах, может не надо?");
    }

    @Override
    public void longDistance() {
        System.out.println("Заплыв на 500 метров");
    }
}
