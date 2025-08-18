package bulut.com.week3.bookorder.model;

import java.time.LocalDate;

public class Book extends Product{

    private Author author;
    private LocalDate publishedDate;
    private LocalDate cratedDate;
    public Book(String name, double price, Author author, LocalDate publishedDate) {
        super(name, price);
        this.author = author;
        this.cratedDate = LocalDate.now();
        this.publishedDate = publishedDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public LocalDate getCratedDate() {
        return cratedDate;
    }

    public void setCratedDate(LocalDate cratedDate) {
        this.cratedDate = cratedDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name=" + getName() +
                ", price=" + getPrice() +
                ", author=" + author +
                ", publishedDate=" + publishedDate +
                ", cratedDate=" + cratedDate +
                '}';
    }
}
