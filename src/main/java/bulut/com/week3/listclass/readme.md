# MyList - Generic Dynamic Array Implementation

Java'da kendi generic dinamik dizi (list) implementasyonumuz.

## Özellikler

- **Generic yapı**: Herhangi bir veri tipi ile çalışır
- **Dinamik boyut**: Kapasitesi otomatik olarak 2 katına çıkar
- **Tip güvenliği**: Compile-time'da tip kontrolü
- **Collection benzeri metodlar**: add, remove, get, set ve daha fazlası

## Kullanım

```java
MyList<Integer> liste = new MyList<>();
liste.add(10);
liste.add(20);
System.out.println(liste.get(0)); // 10
```

## Metodlar

| Metod | Açıklama |
|-------|----------|
| `add(T data)` | Eleman ekler |
| `get(int index)` | Belirtilen indeksteki elemanı getirir |
| `remove(int index)` | Elemanı siler |
| `size()` | Eleman sayısını döndürür |
| `isEmpty()` | Boş mu kontrol eder |
| `contains(T data)` | Eleman var mı kontrol eder |
| `indexOf(T data)` | İlk indeksini bulur |
| `clear()` | Tüm elemanları temizler |

## Constructor'lar

- `MyList()` - Varsayılan kapasite (10)
- `MyList(int capacity)` - Özel kapasite

## Örnek

```java
MyList<String> isimler = new MyList<>();
isimler.add("Ali");
isimler.add("Ayşe");
System.out.println(isimler.toString()); // [Ali, Ayşe]
```