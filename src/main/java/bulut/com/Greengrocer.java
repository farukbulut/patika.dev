package bulut.com;

import java.util.Scanner;

public class Greengrocer {

    public static void main(String[] args){

        double pear = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double eggplant = 5.00;

        try {
            double pearPrice = functionScanner("Armut") * pear;
            double applePrice = functionScanner("Elma") * apple;
            double tomatoPrice = functionScanner("Domates") * tomato;
            double bananaPrice = functionScanner("Muz") * banana;
            double eggplantPrice = functionScanner("Patlıcan") * eggplant;

            double totalPrice = pearPrice + applePrice + tomatoPrice + bananaPrice + eggplantPrice;

            System.out.println("Toplam Fiyat: " + totalPrice + " TL");
        }catch (Exception e){
            System.out.println("Lütfen geçerli değer giriniz(integer veya double)!");
        }
    }

    public static double functionScanner(String text){

        Scanner scanner = new Scanner(System.in);
        System.out.println(text + " Kaç kilo? :");
        double weight = scanner.nextDouble();

        return weight;
    }
}