package bulut.com.week12.library.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "LibraryCategory")
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", columnDefinition = "serial")
    private long id;

    @Column(name = "category_name")
    private String name;

    @ManyToMany(mappedBy = "categoryList", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Book> bookList;
    public Category() {
    }

    @Lob
    @Column(name = "category_description")
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
