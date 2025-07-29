package bulut.com.week2.numberrounding;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Double number = 0.0;
        boolean validInput = false;

        while (!validInput){
            try {
                System.out.println("Lütfen ondalık bir sayı giriniz:");
                number = scanner.nextDouble();
                validInput = true;

            } catch (InputMismatchException e){
                System.out.println("Hatalı bir değer girdiniz. Lütfen geçerli bir ondalık sayı giriniz.");
                scanner.nextLine();
            }
        }

        System.out.println("Girilen sayı: " + number);
        System.out.println("Aşağı yuvarlama: " + Math.floor(number));
        System.out.println("Yukarı yuvarlama: " + Math.ceil(number));
        System.out.println("En yakın tam sayı: " + Math.round(number));

        scanner.close();
    }
}