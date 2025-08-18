package bulut.com.week3.bookorder.model;

import bulut.com.week3.bookorder.model.enums.OrderStatus;
import bulut.com.week3.bookorder.service.OrderService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> productsList;
    private OrderStatus orderStatus;
    private User user;
    private LocalDateTime createdAt;
    private LocalDateTime cancelDate;

    public Order(List<Product> productsList, User user) {
        this.productsList = productsList;
        this.user = user;
        this.orderStatus = OrderStatus.PREPARING;
        this.createdAt = LocalDateTime.now();
        this.cancelDate = null;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void cancelOrder(){
        setOrderStatus(OrderStatus.CANCELED);
        setCancelDate(LocalDateTime.now());
    }

    public Double getTotal(){
        double getTotal = 0.00;
        for (Product product : getProductsList()){
            getTotal+=product.getPrice();
        }

        return getTotal;
    }

    public LocalDateTime getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(LocalDateTime cancelDate) {
        this.cancelDate = cancelDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "totalPrice=" + getTotal() +
                ", productsList=" + productsList +
                ", orderStatus=" + orderStatus +
                ", user=" + user +
                ", createdAt=" + createdAt +
                ", cancelDate=" + cancelDate +
                '}';
    }
}
