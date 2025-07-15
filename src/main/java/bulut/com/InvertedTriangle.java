package bulut.com;

import java.util.Scanner;

public class InvertedTriangle {
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

        for (int i = number; i > 1; i--){
            for (int j = 1; j < i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
