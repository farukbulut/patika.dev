package bulut.com;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        try {
            double height = scanner.nextDouble();
            System.out.println("Lütfen kilonuzu giriniz :");
            double weight = scanner.nextDouble();
            double bmi = weight / (height * height);
            System.out.println("Vücut Kitle İndeksiniz :" + bmi);
        }catch (Exception e){
            System.out.println("Lütfen geçerli değer giriniz(integer veya double)!");
        }

    }
}