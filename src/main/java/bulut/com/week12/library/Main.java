package bulut.com.week12.library;

import bulut.com.week12.library.entity.*;
import bulut.com.week12.library.entity.enums.Country;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Root;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        // 1. VERİ EKLEME
        addData(entityManager);

        // 2. ÖDÜNÇ ALMA KAYITLARI
        addBorrowings(entityManager);


        entityManager.close();
        entityManagerFactory.close();
    }

    // ========== 1. VERİ EKLEME ==========
    public static void addData(EntityManager entityManager) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        try {
            // YAYINCILAR
            Publisher canYayinlari = new Publisher();
            canYayinlari.setName("Can Yayınları");
            canYayinlari.setAddress("İstanbul, Beşiktaş");
            canYayinlari.setEstablishmentYear(1981);

            Publisher iletisimYayinlari = new Publisher();
            iletisimYayinlari.setName("İletişim Yayınları");
            iletisimYayinlari.setAddress("İstanbul, Beyoğlu");
            iletisimYayinlari.setEstablishmentYear(1982);

            Publisher yapiKredi = new Publisher();
            yapiKredi.setName("Yapı Kredi Yayınları");
            yapiKredi.setAddress("İstanbul, Beyoğlu");
            yapiKredi.setEstablishmentYear(1967);

            // YAZARLAR
            Author halideEdib = new Author();
            halideEdib.setName("Halide Edib Adıvar");
            halideEdib.setCountry(Country.Türkiye);
            halideEdib.setBirthDate(LocalDate.of(1884, 6, 11));

            Author orhanPamuk = new Author();
            orhanPamuk.setName("Orhan Pamuk");
            orhanPamuk.setCountry(Country.Türkiye);
            orhanPamuk.setBirthDate(LocalDate.of(1952, 6, 7));

            Author sabahattin = new Author();
            sabahattin.setName("Sabahattin Ali");
            sabahattin.setCountry(Country.Türkiye);
            sabahattin.setBirthDate(LocalDate.of(1907, 2, 25));

            Author dostoyevski = new Author();
            dostoyevski.setName("Fyodor Dostoyevski");
            dostoyevski.setCountry(Country.Rusya);
            dostoyevski.setBirthDate(LocalDate.of(1821, 11, 11));

            // KATEGORİLER
            Category roman = new Category();
            roman.setName("Roman");
            roman.setDescription("Kurgusal, uzun soluklu anlatım türü. İnsan deneyimlerini ve toplumsal olayları derinlemesine işler.");

            Category klasik = new Category();
            klasik.setName("Klasik");
            klasik.setDescription("Edebiyat tarihinde önemli yere sahip, zamanı aşan eserler.");

            Category psikoloji = new Category();
            psikoloji.setName("Psikoloji");
            psikoloji.setDescription("İnsan psikolojisi, davranışları ve zihinsel süreçleri ele alan eserler.");

            Category turk = new Category();
            turk.setName("Türk Edebiyatı");
            turk.setDescription("Türk yazarlar tarafından yazılmış edebi eserler.");

            // KİTAPLAR
            Book handan = new Book();
            handan.setName("Handan");
            handan.setAuthor(halideEdib);
            handan.setPublisher(canYayinlari);
            handan.setPublicationYear(2015);
            handan.setStock(15);
            handan.setCategoryList(Arrays.asList(roman, klasik, turk));

            Book masumiyet = new Book();
            masumiyet.setName("Masumiyet Müzesi");
            masumiyet.setAuthor(orhanPamuk);
            masumiyet.setPublisher(iletisimYayinlari);
            masumiyet.setPublicationYear(2008);
            masumiyet.setStock(20);
            masumiyet.setCategoryList(Arrays.asList(roman, turk));

            Book kuyucakli = new Book();
            kuyucakli.setName("Kuyucaklı Yusuf");
            kuyucakli.setAuthor(sabahattin);
            kuyucakli.setPublisher(yapiKredi);
            kuyucakli.setPublicationYear(2018);
            kuyucakli.setStock(12);
            kuyucakli.setCategoryList(Arrays.asList(roman, klasik, turk));

            Book sucVeCeza = new Book();
            sucVeCeza.setName("Suç ve Ceza");
            sucVeCeza.setAuthor(dostoyevski);
            sucVeCeza.setPublisher(iletisimYayinlari);
            sucVeCeza.setPublicationYear(2020);
            sucVeCeza.setStock(25);
            sucVeCeza.setCategoryList(Arrays.asList(roman, klasik, psikoloji));

            Book beyazKale = new Book();
            beyazKale.setName("Beyaz Kale");
            beyazKale.setAuthor(orhanPamuk);
            beyazKale.setPublisher(canYayinlari);
            beyazKale.setPublicationYear(2016);
            beyazKale.setStock(18);
            beyazKale.setCategoryList(Arrays.asList(roman, turk));

            // KAYDETME
            entityManager.persist(handan);
            entityManager.persist(masumiyet);
            entityManager.persist(kuyucakli);
            entityManager.persist(sucVeCeza);
            entityManager.persist(beyazKale);

            transaction.commit();
            System.out.println("✅ Veriler başarıyla eklendi!\n");

        } catch (Exception e) {
            transaction.rollback();
            System.err.println("❌ Veri ekleme hatası: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // ========== 2. ÖDÜNÇ ALMA KAYITLARI ==========
    public static void addBorrowings(EntityManager entityManager) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        try {
            // Kitapları veritabanından çek
            Book handan = entityManager.createQuery("SELECT b FROM LibraryBook b WHERE b.name = :name", Book.class)
                    .setParameter("name", "Handan")
                    .getSingleResult();

            Book masumiyet = entityManager.createQuery("SELECT b FROM LibraryBook b WHERE b.name = :name", Book.class)
                    .setParameter("name", "Masumiyet Müzesi")
                    .getSingleResult();

            Book sucVeCeza = entityManager.createQuery("SELECT b FROM LibraryBook b WHERE b.name = :name", Book.class)
                    .setParameter("name", "Suç ve Ceza")
                    .getSingleResult();

            // ÖDÜNÇ ALMA 1: Tamamlanmış
            BookBorrowing borrowing1 = new BookBorrowing();
            borrowing1.setName("Ahmet Yılmaz");
            borrowing1.setBorrowingDate(LocalDate.of(2024, 10, 1));
            borrowing1.setReturnDate(LocalDate.of(2024, 10, 15)); // İade edildi
            borrowing1.setBook(handan);

            // ÖDÜNÇ ALMA 2: Devam ediyor
            BookBorrowing borrowing2 = new BookBorrowing();
            borrowing2.setName("Ayşe Demir");
            borrowing2.setBorrowingDate(LocalDate.of(2024, 10, 20));
            borrowing2.setReturnDate(null); // Henüz iade edilmedi
            borrowing2.setBook(masumiyet);

            // ÖDÜNÇ ALMA 3: Tamamlanmış
            BookBorrowing borrowing3 = new BookBorrowing();
            borrowing3.setName("Mehmet Kaya");
            borrowing3.setBorrowingDate(LocalDate.of(2024, 9, 15));
            borrowing3.setReturnDate(LocalDate.of(2024, 9, 30));
            borrowing3.setBook(sucVeCeza);

            // ÖDÜNÇ ALMA 4: Devam ediyor
            BookBorrowing borrowing4 = new BookBorrowing();
            borrowing4.setName("Zeynep Özkan");
            borrowing4.setBorrowingDate(LocalDate.of(2024, 10, 25));
            borrowing4.setReturnDate(null); // Henüz iade edilmedi
            borrowing4.setBook(handan);

            // ÖDÜNÇ ALMA 5: Devam ediyor
            BookBorrowing borrowing5 = new BookBorrowing();
            borrowing5.setName("Can Yıldız");
            borrowing5.setBorrowingDate(LocalDate.of(2024, 10, 28));
            borrowing5.setReturnDate(null); // Henüz iade edilmedi
            borrowing5.setBook(sucVeCeza);

            entityManager.persist(borrowing1);
            entityManager.persist(borrowing2);
            entityManager.persist(borrowing3);
            entityManager.persist(borrowing4);
            entityManager.persist(borrowing5);

            transaction.commit();
            System.out.println("✅ Ödünç alma kayıtları eklendi!\n");

        } catch (Exception e) {
            transaction.rollback();
            System.err.println("❌ Ödünç alma ekleme hatası: " + e.getMessage());
            e.printStackTrace();
        }
    }
}