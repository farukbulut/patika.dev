package bulut.com.week5.innerclass;

public class Employee {
    private String name;
    private String lastname;
    private ContactInfo contactInfo;

    public Employee(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
        this.contactInfo = new ContactInfo();
    }

    public void setContactInfo(String phone, String email) {
        contactInfo.setPhone(phone);
        contactInfo.setEmail(email);
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     static class ContactInfo{
        private String phone;
        private String email;

         public String getPhone() {
             return phone;
         }

         public void setPhone(String phone) {
             this.phone = phone;
         }

         public String getEmail() {
             return email;
         }

         public void setEmail(String email) {
             this.email = email;
         }

         @Override
         public String toString() {
             return "ContactInfo{" +
                     "phone='" + phone + '\'' +
                     ", email='" + email + '\'' +
                     '}';
         }
     }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", contactInfo=" + contactInfo +
                '}';
    }
}
