package bulut.com;

import java.util.Scanner;

public class DivisibleNumbersAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int counter = 0;
        int result = 0;
        int number = 0;
        while (true){
            try {
                number = scanner.nextInt();
                break;
            }catch (Exception e){
                System.out.println("Hatalı bir giriş yaptınız!");
                scanner.nextLine();
            }
        }

        for (int i = 1; i <= number; i++){
            if (i % 3 == 0 && i % 4 == 0){
                System.out.println(i + " sayısı 3 ve 4'e tam bölünüyor");
                result += i;
                counter++;
            }
        }

        if (counter == 0){
            System.out.println("3 ve 4'e tam bölünen sayı bulunamadı!");
        }else {
            System.out.println("Tam bölünen sayıların ortalaması :" + result/counter);
        }
        scanner.close();
    }
}
