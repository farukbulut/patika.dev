package bulut.com.week12.library.entity;

import bulut.com.week12.library.entity.enums.Country;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity(name = "LibraryAuthor")
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id", columnDefinition = "serial")
    private long id;

    @Column(name = "author_name")
    private String name;

    @Column(name = "author_birth_date")
    @Temporal(TemporalType.DATE)
    private LocalDate birthDate;


    @Column(name = "author_country")
    @Enumerated(EnumType.STRING)
    private Country country;

    @OneToMany(mappedBy = "author", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Book> bookList;

    public Author() {
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
