package bulut.com;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl Giriniz :");
        int year = getValidInput(scanner);
        int remainder = year % 4;
        int remainder_100 = year % 100;
        int remainder_400 = year % 400;

        if (remainder_400 == 0 && remainder_100 == 0){
            System.out.println(year + " bir artık yıldır !");
        }else if (remainder == 0 && remainder_100 > 0){
            System.out.println(year + " bir artık yıldır !");
        }else {
            System.out.println(year + " bir artık yıl değildir!");
        }

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