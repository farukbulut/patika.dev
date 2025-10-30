package bulut.com.week12.market.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id", columnDefinition = "serial")
    private Long id;

    @Column(name = "supplier_address", nullable = false)
    private String address;

    @Column(name = "supplier_company", nullable = false)
    private String company;

    @Column(name = "supplier_person", nullable = false)
    private String person;

    @Column(name = "supplier_email", nullable = false)
    private String email;

    @Column(name = "supplier_contact", nullable = false)
    private String contact;


    @OneToMany(mappedBy = "supplier")
    private List<Product> productList;

    public Supplier() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Product> getProductList() {
        return productList;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", company='" + company + '\'' +
                ", person='" + person + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
