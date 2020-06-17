package potapov.sergey.part1.HW6.worker;

public class workerEngineer extends Workers implements workActions {

    private String name;
    private int age;
    private SexEnum sex;
    private final PositionEnum position;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public SexEnum getSex() {
        return sex;
    }

    @Override
    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    @Override
    public PositionEnum getPosition() {
        return position;
    }

    @Override
    public void startWorking() {
        System.out.println("work has started");
    }

    @Override
    public void stopWorking() {
        System.out.println("work has stopped");
    }

    @Override
    public void takeBreak() {
        System.out.println("make a break for 5 minutes!");
    }

    public workerEngineer(String name, int age, SexEnum sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.position = PositionEnum.ENGINEER;
    }


}
