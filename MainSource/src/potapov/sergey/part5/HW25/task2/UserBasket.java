package potapov.sergey.part5.HW25.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserBasket implements Basket {

    private Map<String, Product> productsObjHashMap = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        if (productsObjHashMap.containsKey(product)) {
            int quantityForWrite = quantity + productsObjHashMap.get(product).getQuantity();
            productsObjHashMap.get(product).setQuantity(quantityForWrite);
        } else {
            productsObjHashMap.put(product, new Product(product, quantity));
        }
    }

    @Override
    public void removeProduct(String product) {
        productsObjHashMap.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        if (productsObjHashMap.containsKey(product)) {
            int quantityForWrite = quantity + productsObjHashMap.get(product).getQuantity();
            productsObjHashMap.get(product).setQuantity(quantityForWrite);
        } else {
            System.out.println("Product doesn`t exist");
        }
    }

    @Override
    public void clear() {
        productsObjHashMap.clear();
        System.out.println("User basket was discarded");
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(productsObjHashMap.keySet());

    }

    @Override
    public int getProductQuantity(String product) {
        if (productsObjHashMap.containsKey(product)) {
            System.out.println(productsObjHashMap.get(product).getQuantity());
            return productsObjHashMap.get(product).getQuantity();
        } else {
            System.out.println("Product not found");
            return -1;
        }
    }

    @Override
    public String toString() {
        return "UserBasket{" +
                "productsObjHashMap=" + productsObjHashMap +
                '}';
    }

}
