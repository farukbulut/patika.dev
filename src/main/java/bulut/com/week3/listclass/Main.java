package bulut.com.week3.listclass;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<>();

        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);

        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);

        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        // Diğer metodları test etmek için:
        System.out.println("Liste: " + liste.toString());
        System.out.println("Index 5'teki eleman: " + liste.get(5));

        liste.set(0, 999);
        System.out.println("İlk elemanı değiştirdikten sonra: " + liste.toString());

        liste.remove(0);
        System.out.println("İlk elemanı sildikten sonra: " + liste.toString());
        System.out.println("Yeni eleman sayısı: " + liste.size());

        System.out.println("\n--- YENİ METODLARI TEST ETME ---");

        // indexOf testi
        liste.add(20); // 20'yi tekrar ekleyelim
        System.out.println("20'nin ilk indeksi: " + liste.indexOf(20));
        System.out.println("20'nin son indeksi: " + liste.lastIndexOf(20));
        System.out.println("999'un indeksi: " + liste.indexOf(999)); // olmayan değer

        // isEmpty testi
        System.out.println("Liste boş mu? " + liste.isEmpty());

        // contains testi
        System.out.println("30 var mı? " + liste.contains(30));
        System.out.println("999 var mı? " + liste.contains(999));

        // sublist testi
        MyList<Integer> altListe = liste.sublist(2, 5);
        System.out.println("Alt liste (2-5): " + altListe.toString());

        // toArray testi
        Object[] dizi = liste.toArray();
        System.out.print("Array'e çevrilmiş hali: [");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]);
            if (i < dizi.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        // clear testi
        altListe.clear();
        System.out.println("Alt liste temizlendikten sonra: " + altListe.toString());
        System.out.println("Alt liste boş mu? " + altListe.isEmpty());
    }
}
