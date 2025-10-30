package bulut.com.week12.market.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "colors")
public class Color {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "color_id", columnDefinition = "serial")
    private long id;

    @Column(name = "color_name")
    private String name;

    @ManyToMany(mappedBy = "colorList")
    private List<Product> productList;

    public Color() {
    }

    public Color(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        return "Color{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
