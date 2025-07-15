package bulut.com;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        while (true){
            System.out.println("Lütfen bir sayı giriniz!");
            try {
                number = scanner.nextInt();
                if (number <= 0) {
                    System.out.println("Lütfen pozitif bir sayı giriniz!");
                    continue;
                }
                break;
            }catch (Exception e){
                System.out.println("Hatalı bir giriş yaptınız!");
                scanner.nextLine();
            }
        }

        int divisorsSum = 0;
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                divisorsSum += i;
            }
        }

        if (divisorsSum == number){
            System.out.println(number + " mükemmel sayıdır!");
        }else {
            System.out.println(number + " mükemmel sayı değildir!");
        }
    }
}
