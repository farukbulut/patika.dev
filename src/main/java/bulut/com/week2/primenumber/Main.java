package bulut.com.week2.primenumber;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int number = getUserInput();

            if (number <= 1) {
                System.out.println("1 ve daha küçük sayılar asal sayı değildir.");
                return;
            }

            boolean isPrime = isPrimeNumber(number, 2);
            displayResult(number, isPrime);

        } finally {
            scanner.close();
        }
    }

    private static int getUserInput() {
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Lütfen bir sayı giriniz: ");
                number = scanner.nextInt();
                validInput = true;

            } catch (InputMismatchException e) {
                System.out.println("❌ Hatalı bir değer girdiniz. Lütfen geçerli bir tam sayı giriniz.");
                scanner.nextLine(); // Buffer'ı temizle
            }
        }

        return number;
    }

    private static boolean isPrimeNumber(int number, int divisor) {
        if (divisor == number) {
            return true;
        }

        if (number % divisor == 0) {
            return false;
        }

        if (divisor * divisor > number) {
            return true;
        }

        return isPrimeNumber(number, divisor + 1);
    }


    private static void displayResult(int number, boolean isPrime) {
        if (isPrime) {
            System.out.println("✅ " + number + " sayısı ASAL'dır.");
        } else {
            System.out.println("❌ " + number + " sayısı ASAL DEĞİL'dir.");
        }
    }
}