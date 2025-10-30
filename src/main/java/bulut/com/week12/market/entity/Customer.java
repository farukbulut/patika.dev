package bulut.com.week12.market.entity;

import bulut.com.week12.market.entity.enums.Gender;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", columnDefinition = "serial")
    private long id;

    @Column(name = "customer_name", length = 100, nullable = false)
    private String name;

    @Column(name = "customer_email", length =  100, nullable = false, unique = true)
    private String email;

    @Column(name = "cutomer_on_date")
    @Temporal(TemporalType.DATE)
    private LocalDate  onDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "customer_gerder", nullable = false)
    private Gender gender;

    public Customer() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getOnDate() {
        return onDate;
    }

    public void setOnDate(LocalDate onDate) {
        this.onDate = onDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", onDate=" + onDate +
                ", gender=" + gender +
                '}';
    }
}
