package bulut.com.week2.salary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Çalışanın adını soyadını giriniz: ");
        String name = scanner.nextLine();
        System.out.println("Lütfen Çalışanın maaşını giriniz: ");
        double salary = scanner.nextDouble();
        System.out.println("Lütfen çalışanın haftalık çalışma saatini giriniz: ");
        double workHours = scanner.nextInt();
        System.out.println("Lütfen çalışanın işe başlangıç yılını giriniz: ");
        int year = scanner.nextInt();
        Employee ahmet = new Employee(name, salary, workHours, year);
        System.out.println(ahmet.toString());

    }
}