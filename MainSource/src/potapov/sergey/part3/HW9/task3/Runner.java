package potapov.sergey.part3.HW9.task3;

public class Runner extends Human {

    @Override
    public void run() {
        System.out.println("Марафонец побежал");
    }

    @Override
    public void marapthonRun() {
        System.out.println("Марафонец побежал марафон!");
    }

    @Override
    public void swim() {
        System.out.println("Марафонец поплыл");
    }

    @Override
    public void longDistance() {
        System.out.println("Марафонец плохой плоыец. Может не надо? ");
    }
}
