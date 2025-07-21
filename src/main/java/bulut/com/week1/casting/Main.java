package bulut.com.week1.casting;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Java Tip Dönüşümleri Programı ===\n");

        // Get integer input from user
        System.out.print("Bir tam sayı giriniz: ");
        int integerNumber = scanner.nextInt();

        // Get decimal number input from user
        System.out.print("Bir ondalıklı sayı giriniz: ");
        double decimalNumber = scanner.nextDouble();

        System.out.println("\n=== Girilen Değerler ===");
        System.out.println("Tam sayı: " + integerNumber);
        System.out.println("Ondalıklı sayı: " + decimalNumber);

        // Type conversions
        System.out.println("\n=== Tip Dönüşümleri ===");

        // 1. Convert integer to decimal (Automatic - Widening conversion)
        double integerToDecimal = integerNumber;
        System.out.println("Tam sayı (" + integerNumber + ") -> Ondalıklı: " + integerToDecimal);

        // 2. Convert decimal to integer (Manual - Casting)
        int decimalToInteger = (int) decimalNumber;
        System.out.println("Ondalıklı (" + decimalNumber + ") -> Tam sayı: " + decimalToInteger);

        // Close the scanner
        scanner.close();
    }
}
