package bulut.com.week12.market.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column(name = "product_id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name", nullable = false)
    private String name;

    @Column(name = "produc_price", nullable = false)
    private Double price;

    @Column(name = "product_stock", nullable = false)
    private int stock;


    // PERSIST: Ana entity'i kaydettiğimizde (persist), ilişkili olan entity'i de otomatik olarak kaydeder.
    // MERGE: Ana entity'i güncellediğimizde (merge), ilişkili entity'i de otomatik olarak günceller.
    @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    @JoinColumn(name = "product_code_id", nullable = false, referencedColumnName = "code_id")
    private Code code;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_supplier_id", nullable = false, referencedColumnName = "supplier_id")
    private Supplier supplier;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "pro2colors",
            joinColumns = {@JoinColumn(name = "pro2color_product_id")},
            inverseJoinColumns = {@JoinColumn(name = "pro2color_color_id")}
    )
    private List<Color> colorList;
    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", code=" + code +
                ", supplier=" + supplier +
                ", category=" + category +
                ", colorList=" + colorList +
                '}';
    }

    public List<Color> getColorList() {
        return colorList;
    }

    public void setColorList(List<Color> colorList) {
        this.colorList = colorList;
    }
}
