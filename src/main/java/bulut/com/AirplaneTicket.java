package bulut.com;

import java.util.Scanner;

public class AirplaneTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz :");
        int km = getValidInput(scanner);

        System.out.print("Yaşınızı giriniz :");
        int age = getValidInput(scanner);

        int type = getTripType(scanner);

        // Yaş indirimini hesapla
        double ageDiscount = 0;
        if (age < 12) {
            ageDiscount = 0.5;
        } else if (age >= 12 && age < 24) {
            ageDiscount = 0.1;
        } else if (age > 65) {
            ageDiscount = 0.3;
        }

        // Fiyat hesaplama
        double basePrice = km * 0.10;
        double priceAfterAge = basePrice * (1 - ageDiscount);

        // Gidiş dönüş ise fiyatı ikiye katla
        if (type == 2) {
            priceAfterAge *= 2;
        }

        // Gidiş dönüş indirimi uygula
        double finalPrice = priceAfterAge;
        if (type == 2) {
            finalPrice = priceAfterAge * (1 - 0.2); // %20 gidiş dönüş indirimi
        }

        System.out.println("Toplam Tutar = " + finalPrice);
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

    public static int getTripType(Scanner scanner) {
        while (true) {
            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
            try {
                int type = scanner.nextInt();
                if (type == 1 || type == 2) {
                    return type;
                } else {
                    System.out.println("Hatalı giriş yaptınız! Sadece 1 veya 2 giriniz.");
                }
            } catch (Exception e) {
                System.out.println("Hatalı giriş yaptınız! Sadece sayı giriniz.");
                scanner.nextLine();
            }
        }
    }
}