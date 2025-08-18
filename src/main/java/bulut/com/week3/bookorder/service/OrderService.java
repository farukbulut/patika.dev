package bulut.com.week3.bookorder.service;

import bulut.com.week3.bookorder.model.Order;
import bulut.com.week3.bookorder.model.Product;
import bulut.com.week3.bookorder.model.User;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private static List<Order> orderList = new ArrayList<>();

    public void create(List<Product> productList, User user){
        Order order = new Order(productList, user);
        orderList.add(order);
    }

    public void list(){
        for (Order order: orderList){
            System.out.println(order);
        }
    }
}
