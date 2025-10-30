# 📚 Kütüphane Yönetim Sistemi

Java tabanlı, JPA/Hibernate kullanarak geliştirilmiş bir kütüphane yönetim sistemi.

## 🚀 Özellikler

- ✅ Kitap yönetimi (ekleme, listeleme, güncelleme, silme)
- ✅ Yazar yönetimi
- ✅ Yayınevi yönetimi
- ✅ Kategori yönetimi
- ✅ Kitap ödünç alma/iade sistemi
- ✅ JPA Criteria Query ile veritabanı sorgulama

## 🛠️ Teknolojiler

- **Java** 17+
- **JPA/Hibernate** - ORM Framework
- **PostgreSQL** - Veritabanı
- **Jakarta Persistence API** - Persistence standardı
- **Maven** - Dependency yönetimi

## 📦 Entity İlişkileri

```
Book (Kitap)
├── Author (Yazar) - ManyToOne
├── Publisher (Yayınevi) - ManyToOne
├── Category (Kategori) - ManyToMany
└── BookBorrowing (Ödünç Alma) - OneToMany

Author (Yazar)
└── Book List - OneToMany

Publisher (Yayınevi)
└── Book List - OneToMany

Category (Kategori)
└── Book List - ManyToMany

BookBorrowing (Ödünç Alma)
└── Book - ManyToOne
```

## 🗃️ Veritabanı Şeması

### Tablolar
- `books` - Kitap bilgileri
- `authors` - Yazar bilgileri
- `publishers` - Yayınevi bilgileri
- `categories` - Kategori bilgileri
- `book_borrowings` - Ödünç alma kayıtları
- `books_categories` - Kitap-Kategori ilişki tablosu

## 📊 Örnek Veri

Proje örnek verilerle gelir:
- 5 Yazar (Farklı ülkelerden)
- 3 Yayınevi
- 10 Kitap
- 5 Kategori
- Ödünç alma kayıtları
