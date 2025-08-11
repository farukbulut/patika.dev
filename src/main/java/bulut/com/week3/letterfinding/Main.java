package bulut.com.week3.letterfinding;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 4 elemanlı ArrayList oluşturma ve rastgele harfler ekleme
        ArrayList<String> letter = new ArrayList<>();
        letter.add("M");
        letter.add("Ö");
        letter.add("B");
        letter.add("K");

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== HARF BULMA OYUNU ===");
        System.out.println("Listede bulunan harfleri tahmin etmeye çalışın!");
        System.out.println("Toplam 4 harf girişi yapacaksınız.\n");

        // 4 kez kullanıcıdan harf girişi alma
        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + ". harfi girin: ");
            String prediction = scanner.nextLine().toUpperCase(); // Büyük harfe çevir

            // Harfin listede olup olmadığını kontrol et
            int index = letter.indexOf(prediction);

            if (index != -1) {
                // Harf listede varsa "found" ile değiştir
                System.out.println("✅ Tebrikler! Doğru bildiniz!");
                letter.set(index, "found");
            } else {
                // Harf listede yoksa listeye ekle
                System.out.println("❌ Maalesef bilemediniz! Harf listeye ekleniyor.");
                letter.add(prediction);
            }
        }

        // Sonuç
        System.out.println("===== LİSTENİN SON HALİ =====");
        System.out.println(letter.toString());

        // İstatistik
        long foundCount = letter.stream().filter(s -> s.equals("found")).count();
        System.out.println("\nDoğru tahmin sayısı: " + foundCount + "/4");

        scanner.close();
    }
}