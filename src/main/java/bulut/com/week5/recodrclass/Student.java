package bulut.com.week5.recodrclass;

import java.util.Objects;

public record Student(String name, String lastname, int studentNo) {

    @Override
    public String name() {
        return name;
    }

    @Override
    public String lastname() {
        return lastname;
    }

    @Override
    public int studentNo() {
        return studentNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", studentNo=" + studentNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentNo == student.studentNo && Objects.equals(name, student.name) && Objects.equals(lastname, student.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, studentNo);
    }
}
