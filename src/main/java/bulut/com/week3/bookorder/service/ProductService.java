package bulut.com.week3.bookorder.service;

import bulut.com.week3.bookorder.model.*;
import bulut.com.week3.bookorder.model.enums.Gender;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class ProductService {

    private static Set<Product> products = new HashSet<>();
    public void create(String name, double price, Author author, LocalDate publishedDate){
        Product product = new Book(name, price, author, publishedDate);

        products.add(product);
    }

    public void create(String name, double price){
        Product product = new Magazine(name, price);
        products.add(product);
    }

    public void list(){
        for (Product product: products){
            System.out.println(product);
        }
    }

    public Product findProductName(String productName) {
        for (Product product: products){
            if (product.getName().equals(productName)){
                return product;
            }
        }

        return null;
    }
}
