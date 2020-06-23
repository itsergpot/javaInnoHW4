package potapov.sergey.part3.HW9.task1task2;

public class Duck extends Animal implements Run, Swim, Fly {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void run() {
        System.out.println("Duck is running");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
