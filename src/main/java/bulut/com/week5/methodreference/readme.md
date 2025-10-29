# Java Method Reference Örneği

## 📋 Proje Hakkında
Bu proje, Java'da **Method Reference** kullanımını göstermektedir. Geleneksel for döngüsü yerine daha modern ve okunabilir bir yaklaşım sunmaktadır.

## 🎯 Amaç
Bir liste içindeki isimleri ekrana yazdırırken, geleneksel yöntem yerine method reference kullanarak kodu daha kısa ve anlaşılır hale getirmek.

## 🔄 Karşılaştırma

### Geleneksel Yöntem
```java
for (String name : names) {
    System.out.println(name);
}
```

### Lambda İfadesi ile
```java
names.forEach(name -> System.out.println(name));
```

### Method Reference ile (En Kısa) ✅
```java
names.forEach(System.out::println);
```

## 💡 Method Reference Nedir?
- Method reference, Lambda ifadelerinin daha kısa bir yazım şeklidir
- `::` operatörü kullanılarak bir metoda referans verilir
- Kodun okunabilirliğini artırır
- Java 8 ile gelmiştir

## 🚀 Kullanım
```bash
# Derleme
javac Main.java

# Çalıştırma
java Main
```

## 📤 Beklenen Çıktı
```
Ahmet
Ayşe
Mehmet
Zeynep
```
