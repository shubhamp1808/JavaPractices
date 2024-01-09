package Java8;

import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class FilterStreamExm {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1, "HP", 25000));
        productList.add(new Product(2, "Dell", 30000));
        productList.add(new Product(3, "Lenovo", 28000));
        productList.add(new Product(4, "Sony", 23000));
        productList.add(new Product(5, "Apple", 90000));

        productList.stream()
                .filter(p -> p.price > 25000)
                .forEach(p -> System.out.println(p.name));
    }
}
