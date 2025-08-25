package bulut.com.week5.innerclass;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Ömer", "Bulut");
        employee.setContactInfo("+90 505 234 09 34", "omer@gmail.com");
        System.out.println(employee.toString());
    }
}
