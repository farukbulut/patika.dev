package bulut.com.week2.salary;

public class Employee {
    private String name;
    private double salary;
    private double workHours;
    private int hireYear;
    private static final int year = 2021;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (this.getSalary() > 1000){
            return this.salary*0.03;
        }

        return 0;
    }

    public double bonus(){
        if (this.getWorkHours() > 40){

            return (this.getWorkHours() - 40) * 30;
        }
        return 0;
    }

    public double raiseSalary(){
        int yearWorked = this.year - this.hireYear;
        double increaseRate = 0;
        if (yearWorked < 10){
            increaseRate = 0.05;
        }else if(yearWorked > 9 && yearWorked < 20) {
            increaseRate = 0.1;
        }else if(yearWorked > 19) {
            increaseRate = 0.15;
        }

        return this.salary * increaseRate;
    }

    @Override
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double netSalaryWithTaxAndBonus = salary + bonus - tax;
        double totalSalary = netSalaryWithTaxAndBonus + raise;

        return "Adı : " + name + "\n" +
                "Maaşı : " + salary + "\n" +
                "Çalışma Saati : " + (int)workHours + "\n" +
                "Başlangıç Yılı : " + hireYear + "\n" +
                "Vergi : " + tax + "\n" +
                "Bonus : " + bonus + "\n" +
                "Maaş Artışı : " + raise + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + netSalaryWithTaxAndBonus + "\n" +
                "Toplam Maaş : " + totalSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}


