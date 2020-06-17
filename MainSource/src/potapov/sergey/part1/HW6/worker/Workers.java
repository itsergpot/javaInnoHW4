package potapov.sergey.part1.HW6.worker;

public class Workers implements workActions{
    private String name;
    private int age;
    private SexEnum sex;
    private PositionEnum position;

    public PositionEnum getPosition() {
        return position;
    }

    public void setPosition(PositionEnum position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    //default constructor
    public Workers() {
        setName(null);
        setAge(0);
        setSex(null);
        setPosition(null);
    }

    @Override
    public void startWorking() {

    }

    @Override
    public void stopWorking() {

    }

    @Override
    public void takeBreak() {

    }
}
