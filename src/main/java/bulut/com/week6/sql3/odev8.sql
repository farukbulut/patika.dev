CREATE TABLE employee (
  id INTEGER PRIMARY KEY,
  name VARCHAR(50),
  birthday DATE,
  email VARCHAR(100)
);

INSERT INTO employee (id, name, birthday, email) VALUES
(1, 'Ahmet Yılmaz', '1985-03-15', 'ahmet.yilmaz@email.com'),
(2, 'Ayşe Demir', '1990-07-22', 'ayse.demir@email.com'),
(3, 'Mehmet Kaya', '1988-12-05', 'mehmet.kaya@email.com'),
(4, 'Fatma Şahin', '1992-09-18', 'fatma.sahin@email.com'),
(5, 'Ali Özkan', '1987-04-30', 'ali.ozkan@email.com'),
(6, 'Emine Çelik', '1989-06-14', 'emine.celik@email.com'),
(7, 'Mustafa Koç', '1986-01-28', 'mustafa.koc@email.com'),
(8, 'Zehra Aydın', '1993-11-03', 'zehra.aydin@email.com'),
(9, 'Hasan Polat', '1984-08-19', 'hasan.polat@email.com'),
(10, 'Merve Arslan', '1991-05-07', 'merve.arslan@email.com'),
(11, 'Osman Güney', '1988-10-12', 'osman.guney@email.com'),
(12, 'Seda Bulut', '1990-02-25', 'seda.bulut@email.com'),
(13, 'İbrahim Karaca', '1985-09-08', 'ibrahim.karaca@email.com'),
(14, 'Hatice Erdoğan', '1987-12-16', 'hatice.erdogan@email.com'),
(15, 'Kemal Taş', '1992-04-21', 'kemal.tas@email.com'),
(16, 'Elif Yıldız', '1989-07-30', 'elif.yildiz@email.com'),
(17, 'Ramazan Kurt', '1986-03-11', 'ramazan.kurt@email.com'),
(18, 'Gülsün Öz', '1991-08-26', 'gulsun.oz@email.com'),
(19, 'Selim Başak', '1983-06-04', 'selim.basak@email.com'),
(20, 'Ayten Mutlu', '1990-01-17', 'ayten.mutlu@email.com'),
(21, 'Cemal Aktaş', '1988-11-29', 'cemal.aktas@email.com'),
(22, 'Rukiye Doğan', '1993-05-13', 'rukiye.dogan@email.com'),
(23, 'Yasin Özdemir', '1985-02-06', 'yasin.ozdemir@email.com'),
(24, 'Meryem Kılıç', '1989-09-22', 'meryem.kilic@email.com'),
(25, 'Tuncay Yaman', '1987-07-15', 'tuncay.yaman@email.com'),
(26, 'Sevim Topal', '1992-03-28', 'sevim.topal@email.com'),
(27, 'Ömer Çiftçi', '1984-12-10', 'omer.ciftci@email.com'),
(28, 'Hacer Işık', '1990-10-05', 'hacer.isik@email.com'),
(29, 'Volkan Sezer', '1986-08-18', 'volkan.sezer@email.com'),
(30, 'Perihan Yurt', '1991-04-02', 'perihan.yurt@email.com'),
(31, 'Erkan Güven', '1988-01-24', 'erkan.guven@email.com'),
(32, 'Songül Kara', '1993-06-09', 'songul.kara@email.com'),
(33, 'Bayram Çetin', '1985-11-14', 'bayram.cetin@email.com'),
(34, 'Nuray Şen', '1989-09-27', 'nuray.sen@email.com'),
(35, 'Recep Bozkurt', '1987-05-20', 'recep.bozkurt@email.com'),
(36, 'Filiz Öztürk', '1992-02-12', 'filiz.ozturk@email.com'),
(37, 'Levent Akın', '1984-08-03', 'levent.akin@email.com'),
(38, 'Şule Güler', '1990-12-25', 'sule.guler@email.com'),
(39, 'Necmi Yavuz', '1986-07-08', 'necmi.yavuz@email.com'),
(40, 'Fadime Önal', '1991-03-16', 'fadime.onal@email.com'),
(41, 'Cihan Tekin', '1988-10-31', 'cihan.tekin@email.com'),
(42, 'Zahide Çakır', '1993-01-19', 'zahide.cakir@email.com'),
(43, 'Serkan Uysal', '1985-06-23', 'serkan.uysal@email.com'),
(44, 'Kevser Biçer', '1989-11-07', 'kevser.bicer@email.com'),
(45, 'Durmuş Çevik', '1987-04-14', 'durmus.cevik@email.com'),
(46, 'İnci Altın', '1992-08-29', 'inci.altin@email.com'),
(47, 'Orhan Turan', '1984-05-11', 'orhan.turan@email.com'),
(48, 'Esma Eroğlu', '1990-09-04', 'esma.eroglu@email.com'),
(49, 'Kadir Demirci', '1986-02-17', 'kadir.demirci@email.com'),
(50, 'Zeynep Arslan', '1991-11-12', 'zeynep.arslan@email.com');
-- ID'ye göre güncelleme
UPDATE employee SET name = 'Yeni İsim 1', birthday = '1995-01-01', email = 'yeni1@email.com' WHERE id = 1;
UPDATE employee SET name = 'Yeni İsim 2', birthday = '1996-02-02', email = 'yeni2@email.com' WHERE id = 2;

-- NAME'e göre güncelleme
UPDATE employee SET id = 100, birthday = '1993-03-03', email = 'guncel1@email.com' WHERE name = 'Ahmet Yılmaz';
UPDATE employee SET id = 101, birthday = '1994-04-04', email = 'guncel2@email.com' WHERE name = 'Ayşe Demir';

-- BIRTHDAY'e göre güncelleme
UPDATE employee SET name = 'Doğum Günü Güncelleme', email = 'birthday@email.com' WHERE birthday = '1985-03-15';

-- EMAIL'e göre güncelleme
UPDATE employee SET name = 'Email Güncelleme', birthday = '2000-01-01' WHERE email = 'mehmet.kaya@email.com';

-- Birden fazla koşulla güncelleme
UPDATE employee SET name = 'Çoklu Güncelleme' WHERE id > 40 AND birthday < '1990-01-01';

-- ID'ye göre silme
DELETE FROM employee WHERE id = 3;
DELETE FROM employee WHERE id = 4;

-- NAME'e göre silme
DELETE FROM employee WHERE name = 'Mehmet Kaya';
DELETE FROM employee WHERE name = 'Fatma Şahin';

-- BIRTHDAY'ye göre silme
DELETE FROM employee WHERE birthday = '1987-04-30';

-- EMAIL'e göre silme
DELETE FROM employee WHERE email = 'zeynep.arslan@email.com';

-- Tarih aralığına göre silme
DELETE FROM employee WHERE birthday BETWEEN '1985-01-01' AND '1986-12-31';