package bulut.com.week2.multiplicationtable;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int multiplier = getUserInput();
        int struck = getUserInput();

        for (int i = 1 ; i <= multiplier; i++){
            for (int j = 1 ; j <= struck; j++){
                System.out.println(i + "*" + j + " = "  + i*j);
            }
        }
    }

    private static int getUserInput() {
        int number = 0;
        boolean validInput = false;
        Scanner scanner = new Scanner(System.in);
        while (!validInput) {
            try {
                System.out.print("Lütfen bir 1-10 arası bir sayı giriniz: ");
                number = scanner.nextInt();
                if (number < 0 || number > 9){
                    System.out.println("❌ Hatalı bir değer girdiniz. Lütfen geçerli bir tam sayı giriniz.");
                }
                validInput = true;

            } catch (InputMismatchException e) {
                System.out.println("❌ Hatalı bir değer girdiniz. Lütfen geçerli bir tam sayı giriniz.");
                scanner.nextLine(); // Buffer'ı temizle
            }
        }

        return number;
    }
}