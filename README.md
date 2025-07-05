# 🎓 Öğrenci Bilgi Sistemi | Student Management System in Java

## 📌 Proje Açıklaması | Project Description

**TR:**  
Bu proje, Java programlama dili ile geliştirilen çok sınıflı bir öğrenci bilgi sistemidir. Kullanıcıdan terminal aracılığıyla veri alınarak lisans ve yüksek lisans öğrencileri, dersleri ve bölümleri organize edilir. Menü üzerinden tüm veriler listelenebilir, ders kredilerine göre ayrıştırılabilir veya isim/soyisim gibi parametrelere göre aranabilir.

**EN:**  
This project is a multi-class student information system built with Java. Users can input data via terminal to manage undergraduate and graduate students, their departments and courses. Data can be listed, grouped by course credits, or searched by student or course name.

---

## 🧩 Sınıflar | Class Overview

- `Ogrenci.java` → Tüm öğrencilere ait ortak özellikleri barındıran temel sınıf  
- `LisansOgrencisi.java` → Lisans öğrencilerini temsil eden alt sınıf  
- `YLOgrencisi.java` → Yüksek lisans öğrencileri için alt sınıf  
- `Ders.java` → Ders ID, adı ve kredi bilgilerini tutar  
- `Bolum.java` → Bölüm adı, numarası, ders ve öğrenci listelerini tutar  
- `Anasayfa.java` → Kullanıcıdan giriş alan, verileri yöneten ve menü sistemini içeren ana sınıf

---

## 📋 Uygulama Özellikleri | Features

- 👩‍🎓 Lisans/YL öğrenci tanımlama  
- 📚 Ders tanımlama (kredi ile birlikte)  
- 🏛️ Bölüm oluşturma ve ilişkilendirme  
- 📑 Tüm öğrencileri/bölümleri/dersleri listeleme  
- 🔍 Arama özelliği (isim, soyisim, ders adı ile)  
- 🧾 Ders kredisine göre listeleme  
- 🎯 Sınıfa göre filtreleme  

---

## 🖥️ Nasıl Çalıştırılır | How to Run

### Gereksinimler / Requirements

- Java JDK 8 veya üstü

### Derleme / Compile

```bash
javac *.java
```

### Çalıştırma / Run

```bash
java Anasayfa
```

---

## 📂 Örnek Menü | Menu Example

```
1 - Tum bolum bilgilerini listeleme
2 - Lisans ogrencilerini listeleme
3 - Yuksek lisans ogrencilerini listeleme
4 - Dersleri listeleme
5 - Arama
6 - Cikis
```

---

## 📄 Lisans | License

MIT License

---

## 🎓 Not

Bu proje eğitim amaçlıdır ve Java'da sınıf yapısı, inheritance, array kullanımı ve kullanıcı etkileşimi gibi konulara örnek teşkil eder.
