package bulut.com.week3.bookorder;

import bulut.com.week3.bookorder.model.Author;
import bulut.com.week3.bookorder.model.Book;
import bulut.com.week3.bookorder.model.Product;
import bulut.com.week3.bookorder.model.User;
import bulut.com.week3.bookorder.model.enums.Gender;
import bulut.com.week3.bookorder.service.AuthorService;
import bulut.com.week3.bookorder.service.OrderService;
import bulut.com.week3.bookorder.service.ProductService;
import bulut.com.week3.bookorder.service.UserService;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserService  userService = new UserService();
        userService.create("Ömer", "omer@gmail.com", "password");
        userService.create("Merve", "merve@gmail.com", "password");
        userService.create("Gülay", "gülay@gmail.com", "password");

        userService.list();

        AuthorService authorService = new AuthorService();
        authorService.create("Orhan", "Pamuk", Gender.MAN);

        Author author = authorService.findAuthor("Orhan");

        ProductService productService = new ProductService();
        productService.create("Kar", 122.00, author, LocalDate.of(2002, 12, 12));
        productService.create("Sessiz Ev", 110.00, author, LocalDate.of(1983, 12, 12));
        productService.create("Kara Kitap", 140.00, author, LocalDate.of(1990, 12, 12));
        productService.create("Java Dergi 1", 240.00);
        productService.create("Java Dergi 2", 200.00);

        productService.list();

        Product searchProduct = productService.findProductName("Kar");
        Product searchProduct2 = productService.findProductName("Sessiz Ev");
        Product searchProduct3 = productService.findProductName("Java Dergi 1");
        User userSearch = userService.findUserByEmail("merve@gmail.com");
        OrderService orderService = new OrderService();
        orderService.create(List.of(searchProduct, searchProduct2,searchProduct3), userSearch);

        orderService.list();

    }
}
