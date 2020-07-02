package potapov.sergey.part3.HW13;

public class Child {

    public void eat(Food food) throws NotTastyFoodException{

        switch (food.name) {
            case "Морковь":
            case "Каша":
                incFood(food);
                throw new NotTastyFoodException("Еда невкусная, хтьфу!");
            case "Конфета":
            case "Яблоко":
                incFood(food);
                System.out.println("съел … за обе щеки");
                break;
            default:
                System.out.println("Что-то непонятное...");
        }

    }

    public void sayThanks(){
        System.out.println("спасибо, мама.");
    }

    public void kiss(){
        System.out.println("Целует маму.");
    }

    public void incFood(Food food){
        System.out.println("Ребенок пробует: " + food.name);
    }
}
