package potapov.sergey.part5.HW23;

public class Main {
    public static void main(String[] args) {
        UserBasket userBasket = new UserBasket();


        userBasket.addProduct("beer",3);
        userBasket.addProduct("meat",3);
        userBasket.addProduct("apple",3);
        userBasket.addProduct("apple",3);
        userBasket.addProduct("apple",3);
        System.out.println(userBasket.toString());
        userBasket.removeProduct("apple");
        System.out.println(userBasket.toString());
        userBasket.updateProductQuantity("beer",3);
        System.out.println(userBasket.toString());
        userBasket.updateProductQuantity("ProductIsNotExist",3);
        userBasket.clear();
        System.out.println(userBasket.toString());
        userBasket.addProduct("meat",12);
        userBasket.addProduct("apple",3);
        userBasket.addProduct("beer",3);
        System.out.println(userBasket.toString());
        userBasket.getProductQuantity("meat");
        userBasket.getProductQuantity("juice");
        System.out.println(userBasket.getProducts());
    }
}
