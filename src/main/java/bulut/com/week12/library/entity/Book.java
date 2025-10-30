package bulut.com.week12.library.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity(name="LibraryBook")
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", columnDefinition = "serial")
    private long id;

    @Column(name = "book_name")
    private String name;

    @Column(name = "book_publication_year")
    private int publicationYear;

    @Column(name = "stock")
    private int stock;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "book_author_id", referencedColumnName = "author_id")
    private Author author;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "book_publisher_id", referencedColumnName = "publisher_id")
    private Publisher publisher;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinTable(
            name = "books_categories",
            joinColumns = {@JoinColumn(name = "books_categories_book_id")},
            inverseJoinColumns = {@JoinColumn(name = "books_categories_category_id")}
    )
    private List<Category> categoryList;

    @OneToMany(mappedBy = "book", cascade = CascadeType.PERSIST)
    private List<BookBorrowing> borrowingList;

    public Book() {
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

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public List<BookBorrowing> getBorrowingList() {
        return borrowingList;
    }

    public void setBorrowingList(List<BookBorrowing> borrowingList) {
        this.borrowingList = borrowingList;
    }
}
