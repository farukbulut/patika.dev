package bulut.com.week12.market.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "code")
public class Code {

    @Id
    @Column(name = "code_id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "code_group", length = 255, nullable = false)
    private String codeGroup;

    @Column(name = "code_serial", nullable = false)
    private String codeSerial;

    @OneToOne(mappedBy = "code")
    private Product product;

    public Code() {
    }

    public Product getProduct() {
        return product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeGroup() {
        return codeGroup;
    }

    public void setCodeGroup(String codeGroup) {
        this.codeGroup = codeGroup;
    }

    public String getCodeSerial() {
        return codeSerial;
    }

    public void setCodeSerial(String codeSerial) {
        this.codeSerial = codeSerial;
    }

    @Override
    public String toString() {
        return "Code{" +
                "id=" + id +
                ", codeGroup='" + codeGroup + '\'' +
                ", codeSerial='" + codeSerial + '\'' +
                '}';
    }
}
