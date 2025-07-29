# Şifre Doğrulama Sistemi

Bu proje, kullanıcıdan alınan şifrenin belirli kurallara uygun olup olmadığını kontrol eden bir JavaScript uygulamasıdır.

## 📋 Şifre Kuralları

Geçerli bir şifre için aşağıdaki tüm kurallara uyulması gerekmektedir:

1. **En az 8 karakter** içermeli
2. **Space (boşluk) karakteri içermemeli**
3. **İlk harf büyük harf** olmalı
4. **Son karakter ? işareti** olmalı

## ✅ Geçerli Şifre Örnekleri
- `Merhaba123?`
- `Password123?`
- `Deneme456?`
- `MySecret789?`

## ❌ Geçersiz Şifre Örnekleri
- `merhaba123?` → İlk harf küçük
- `Mer123?` → 8 karakterden az
- `Merhaba 123?` → Space karakteri içeriyor
- `Merhaba123!` → Son karakter ? değil