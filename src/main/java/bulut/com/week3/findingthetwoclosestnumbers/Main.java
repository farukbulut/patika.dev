package bulut.com.week3.findingthetwoclosestnumbers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Benzersiz sayılar için Set kullanıyoruz
        Set<Integer> uniqueNumbers = new HashSet<>();
        Random random = new Random();

        // 10 adet benzersiz pozitif sayı üret
        while (uniqueNumbers.size() < 10) {
            uniqueNumbers.add(random.nextInt(100000)); // 0-99999 arası
        }

        // Set'i ArrayList'e çevir
        ArrayList<Integer> integers = new ArrayList<>(uniqueNumbers);
        ArrayList<Numbers> allNumber = new ArrayList<>();

        // Listeyi sırala
        integers.sort(null);

        System.out.println("Üretilen benzersiz sayılar (sıralı): " + integers);
        System.out.println("\nTüm ardışık çiftler ve farkları:");
        System.out.println("----------------------------------------");

        // Ardışık elemanları karşılaştır
        for (int i = 0; i < integers.size() - 1; i++) {
            Numbers numbers = new Numbers(integers.get(i), integers.get(i + 1));
            allNumber.add(numbers);
        }

        // Farka göre sırala (en küçük fark önce)
        allNumber.sort(Comparator.comparingInt(Numbers::getDifference));

        // Tüm çiftleri yazdır
        for (Numbers numbers : allNumber) {
            System.out.println(numbers);
        }

        // En yakın çifti özel olarak vurgula
        if (!allNumber.isEmpty()) {
            Numbers closest = allNumber.get(0);
            System.out.println("\n🎯 EN YAKIN İKİ SAYI:");
            System.out.println("Sayı 1: " + closest.getFirstNumber());
            System.out.println("Sayı 2: " + closest.getNextNumber());
            System.out.println("Aralarındaki fark: " + closest.getDifference());
        }
    }
}