# Java Lambda İfadeleri - Sayı İkiye Katlama 🚀

## 📝 Açıklama
Bir listedeki sayıları 2 katına çıkaran basit Java uygulaması. Geleneksel for döngüsü yerine modern Lambda ifadeleri kullanılmıştır.

## ⚡ Tek Satır Kod
```java
Stream.of(1, 2, 3, 4, 5).map(n -> n * 2).forEach(System.out::println);
```