package bulut.com;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz :");
        int year = getValidInput(scanner);
        int remainder = year % 12;

        String animal = switch (remainder){
            case 0 -> "Maymun";
            case 1 -> "Horoz";
            case 2 -> "Köpek";
            case 3 -> "Domuz";
            case 4 -> "Fare";
            case 5 -> "Öküz";
            case 6 -> "Kaplan";
            case 7 -> "Tavşan";
            case 8 -> "Ejder";
            case 9 -> "Yılan";
            case 10 -> "At";
            case 11 -> "Koyun";
            default -> "Bilinmeyen";
        };

        System.out.println("Çin Zodyağı Burcunuz: " + animal);
        scanner.close();
    }

    public static int getValidInput(Scanner scanner) {
        while (true) {
            try {
                int value = scanner.nextInt();
                if (value < 0) {
                    System.out.print("Hatalı Veri Girdiniz ! Değeri 0'dan büyük olmalı! Tekrar giriniz: ");
                    continue;
                }
                return value;
            } catch (Exception e) {
                System.out.print("Hatalı Veri Girdiniz ! Değeri integer olmalı! Tekrar giriniz: ");
                scanner.nextLine();
            }
        }
    }
}