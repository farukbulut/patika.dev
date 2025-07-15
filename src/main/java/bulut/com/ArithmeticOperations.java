package bulut.com;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int a = scanner(1);
        int b = scanner(2);
        int c = scanner(3);
        int result = a+b*c-b;
        System.out.print("Sonuç : " + result);
    }

    public static int scanner(int i){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Lütfen " + i +". sayısı giriniz!");
            try {
                int value = scanner.nextInt();
                return value;
            }catch (Exception e){
                scanner.nextLine();
                System.out.print("Lütfen sayı giriniz !!!");
            }
        }
    }
}
