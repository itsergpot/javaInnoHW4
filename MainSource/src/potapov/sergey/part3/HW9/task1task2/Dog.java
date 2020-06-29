package potapov.sergey.part3.HW9.task1task2;

public class Dog extends Animal implements Run, Swim{

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }
}
