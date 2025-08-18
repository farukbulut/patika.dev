package bulut.com.week3.bookorder.model;

import bulut.com.week3.bookorder.model.enums.Gender;

import java.time.LocalDate;

public class Author {
    private String name;
    private String lastname;
    private Gender gender;
    private LocalDate birthDay;
    private String big;

    public Author(String name, String lastname, Gender gender) {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getBig() {
        return big;
    }

    public void setBig(String big) {
        this.big = big;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender=" + gender +
                ", birthDay=" + birthDay +
                ", big='" + big + '\'' +
                '}';
    }
}
