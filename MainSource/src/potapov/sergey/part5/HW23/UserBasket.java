package potapov.sergey.part5.HW23;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserBasket implements Basket{

    private List<Product> productsObjArrList = new ArrayList<>();

    @Override
    public void addProduct(String product, int quantity) {

        boolean trigger;

        if (!productsObjArrList.isEmpty()) {
            trigger = isTrigger(product, quantity, false);
            if (!trigger) {
                productsObjArrList.add(new Product(product, quantity));
            }

        }
        else {
            productsObjArrList.add(new Product(product, quantity));
        }
    }

    @Override
    public void removeProduct(String product) {
        productsObjArrList.removeIf(product1 -> product1.getName().equals(product));
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {

        boolean trigger;

        trigger = isTrigger(product, quantity, false);

        if (!trigger) {
            System.out.println("Product doesn`t exist");
        }
    }

    private boolean isTrigger(String product, int quantity, boolean trigger) {

        for (Product productIt : productsObjArrList) {
            if (productIt.getName().equals(product)) {
                productIt.setQuantity(productIt.getQuantity() + quantity);
                trigger = true;
                break;
            }
        }
        return trigger;
    }

    @Override
    public void clear() {
        productsObjArrList = new ArrayList<>();
        System.out.println("User basket was discarded");
    }

    @Override
    public List<String> getProducts() {
        return productsObjArrList.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
    }

    @Override
    public int getProductQuantity(String product) {
        for (Product tmp : productsObjArrList) {
            if (tmp.getName().equals(product)) {
                System.out.println(tmp.getQuantity());
                return tmp.getQuantity();
            }
        }
        System.out.println("Product not found");
        return -1;
    }

    @Override
    public String toString() {
        return "UserBasket[" +
                "productsObjArrList=" + productsObjArrList +
                ']';
    }

}
