package bulut.com.week12.market;


import bulut.com.week12.market.entity.*;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        /*
        Supplier supplier = new Supplier();
        supplier.setAddress("Malatya");
        supplier.setCompany("Bulut");
        supplier.setContact("Ömer");
        supplier.setEmail("omer@gmail.com");
        supplier.setPerson("Ömer");
        entityManager.persist(supplier);

        Code code = new Code();
        code.setCodeGroup("123456");
        code.setCodeSerial("123456");
        entityManager.persist(code);

        Code code2 = new Code();
        code2.setCodeGroup("12345");
        code2.setCodeSerial("12345");
        entityManager.persist(code2);

        Category category = new Category();
        category.setName("Telefon");
        entityManager.persist(category);


        Color blue = new Color("Blue");
        Color green = new Color("Green");
        Color white = new Color("White");
        entityManager.persist(blue);
        entityManager.persist(green);
        entityManager.persist(white);

        List<Color> colorList = new ArrayList<>();
        colorList.add(green);
        colorList.add(white);
        colorList.add(blue);

        Product product = new Product();
        product.setCode(code);
        product.setName("İphone 16 Pro Max");
        product.setPrice(10800.5);
        product.setStock(15);
        product.setColorList(colorList);
        product.setSupplier(supplier);
        product.setCategory(category);
        entityManager.persist(product);

        Product product2 = new Product();
        product2.setCode(code2);
        product2.setName("İphone 16 Pro");
        product2.setPrice(98000.0);
        product2.setStock(15);
        product2.setColorList(colorList);
        product2.setSupplier(supplier);
        product2.setCategory(category);
        entityManager.persist(product2);
*/

        Product product3 = entityManager.find(Product.class, 1);
        System.out.println(product3.getName());
        transaction.commit();
    }
}
