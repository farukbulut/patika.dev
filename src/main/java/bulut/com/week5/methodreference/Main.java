package bulut.com.week5.methodreference;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Ayşe");
        names.add("Mehmet");
        names.add("Zeynep");

        // Method Reference kullanarak liste elemanlarını yazdırma
        // System.out::println bir method reference'dır
        names.forEach(System.out::println);

        /* AÇIKLAMA:
         *
         * Geleneksel Yöntem:
         * for (String name : names) {
         *     System.out.println(name);
         * }
         *
         * Lambda İfadesi ile:
         * names.forEach(name -> System.out.println(name));
         *
         * Method Reference ile (En Kısa):
         * names.forEach(System.out::println);
         *
         * Method Reference Açıklaması:
         * - System.out::println şeklindeki yazım, her bir eleman için
         *   println metodunu çağırır
         * - :: operatörü method reference operatörüdür
         * - Bu yöntem kodu daha okunabilir ve temiz yapar
         */
    }
}
