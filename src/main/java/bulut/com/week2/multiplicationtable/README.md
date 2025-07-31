# Çarpım Tablosu Oluşturma

## Çarpım Tablosu Oluşturma

### Amaç
Kullanıcıdan `n` (1 – 10 arası pozitif tam sayı) değerini alıp
`1 × 1`'den `n × n`'e kadar olan çarpım tablosunu ekrana yazdıran bir Java programı yazın.

### Gereksinimler
1. Kullanıcıdan `Scanner` ile **üst sınır** `n` değerini okuyun.
2. `n` değeri **1 ile 10 (dahil)** arasında değilse, anlamlı bir hata mesajı gösterin ve programı sonlandırın.
3. Geçerli durumda, **iç içe** `for` **döngüleri** kullanarak çarpım tablosunu üretin.
4. Tüm kod tek bir `main` metodu içinde veya size uygun tek bir sınıfta yer alabilir.

**Ekstra (Opsiyonel):** Çıktıyı hizalı göstermek için biçimlendirme kullanabilirsiniz, örn: `System.out.printf("%-4d", i*j);`

### Örnek Girdi
```
Üst sınırı giriniz (1‑10): 5
```

### Örnek Çıktı
```
1  2  3  4  5
2  4  6  8  10
3  6  9  12 15
4  8  12 16 20
5  10 15 20 25
```