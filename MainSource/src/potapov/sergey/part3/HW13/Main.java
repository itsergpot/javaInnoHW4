package potapov.sergey.part3.HW13;

public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        Food[] foods = Food.values();

        for (Food food: foods) {
            try {
                child.eat(food);
            } catch (NotTastyFoodException ex) {
                System.out.println(ex.getMessage());
            }
            finally {
                child.sayThanks();
                child.kiss();
            }
        }

    }
}
