# Appium ile Mobil Uygulama Testi

## Mobil Uygulama Testi Nedir?
Mobil Uygulama Testleri, farklı platformlar için geliştirilmiş mobil uygulamaların mobil web sitelerinin doğru ve istenildiği gibi çalışıp çalışmadığının kontrol edilmesi amacıyla gerçekleştirilen yazılım test aktiviteleridir [1].

Mobil uygulama testi, genellikle bir mobil uygulama geliştirildikten veya tüketicilere bırakılmadan önce mobil uygulama geliştiricileri tarafından gerçekleştirilir. Tipik olarak, mobil uygulama testinin temel hedefleri şunlardır:

•	Donanım uyumluluğu ve işlevselliği: Mobil uygulamanın bir mobil aygıtın fiziksel girdisine ve bileşenlerle etkileşimine yanıtı. Buna dokunmatik ekran, klavye, ekran, sensörler, ağ ve daha fazlası dahildir.

•	İşletim sistemi uyumluluğu: Uygulamanın farklı işletim sistemi platformlarıyla tamamen uyumlu olduğunu değerlendirir ve garanti eder.

•	Kaynak kodu değerlendirmesi: Uygulamadaki tüm kod hatalarını ve hataları tanımlar ve çözer.

•	Kullanılabilirlik ve İşlevsellik: Uygulamanın kullanımı kolaydır ve istenen tüm işlevleri sağlar [2].


 
![test1](https://user-images.githubusercontent.com/58858983/161403462-de983706-a0dd-4d82-ba07-5626d1ccc70a.jpeg)
<h5 align="center">Resim 1 Mobil Uygulama Testi [3]</h3>
<br>

## Mobil Testin Faydaları Nelerdir?
Uygulama üzerinde yapılan mobil testlerin yararları kısaca şöyledir;

•	Uygulamadaki eksikliklerin saptanmasında yardımcı olur.

•	Mobil uygulamaların iyileştirilmesi için avantaj sağlar.

•	Olası virüs ve risklerin giderilmesini sağlar.

•	Geliştirme aşamasında mobil test oldukça önemlidir.

•	Yeniden yapılandırma sağlar.

•	Uygulamaların optimizasyonunu kolaylaştırır [4].
<br>
<br>

<p align="center">
  <img src="https://user-images.githubusercontent.com/58858983/161403636-e25a3dcd-ca2a-4b6d-ad19-08e98d6fabda.jpeg">
</p>
<h5 align="center">Resim 2 Mobil Testin Faydaları [5]</h3>
<br>


## Test Türleri
1.	Kullanılabilirlik Testi: Uygulamanın ne kadar kullanıcı dostu ve sezgisel olduğunu test eder. Uygulamanın ara yüzü her cihaz için uyumlu, yazılar okunaklı olmalıdır. Buton boyutları farklı parmak tipleri tarafından kolayca tıklanacak şekilde olmalıdır. Kullanılabilirlik testi, gerçek cihazlar, son kullanıcının ne deneyimleyeceğini daha yakından yansıttığından, gerçek mobil cihazlar bu tür testlerde kritik öneme sahiptir.

2.	İşlevsel Test: İşlevsel test, en temel test sürecidir. Uygulamamızın; cihazlar, işletim sistemleri ve diğer varyasyonlarda tüm özelliklerinin olması gerektiği gibi çalışıp çalışmadığını test eder ve çözümler.

3.	Performans Testi: Performans testi, uygulamanızın performansını farklı koşullar altında test eder. Yük testi, stres testi ve hacim testi bazı performans testleri arasındadır.

4.	Yerelleştirme Testi: Yerelleştirme testi, uygulamayı yerel dil, kültür, dini duygular ve cihaz erişebilirliği ile uyumlu hale getirecek test türüdür.

5.	Uyumluluk Testi: Mobil uygulamamızın her tür cihaz, nesil, işletim sistemi, farklı donanım ve yazılım türlerinde uyumlu çalışıp çalışmadığını test eder.

6.	Kurulum Testi: Kurulum testi, uygulamanızın App Store veya Google Play’den doğru şekilde indirme süreçlerini analiz eden bir tür mobil testtir. Bu tür testler, uygulamanın kaldırılmasında olduğu gibi uygulama yükleme ve güncellemelerinin de sorunsuz bir şekilde çalıştığını doğrular.

7.	Güvenlik Testi: Kullanıcılar, verilerinin veya hassas bilgilerinin tehlikeye atılmayacağından emin olmak ister. Sızma testi, güvenlik açığı testi ve güvenlik taraması gibi testlerle mobil uygulamanızın güvenirliğini test edebilirsiniz. Güvenlik testleri uygulamanızdaki güvenlik açıklarını bulmayı içerir.

8.	Gerçek Kullanıcı Durum Testi: Uygulama doğru cihaz ve platformlarda değişen kullanıcı koşullarına ve ortamlarına karşı (Kamera, Ses, Rotasyon...) simülasyon testinden geçmelidir.

9.	Erişebilirlik Testi: Erişebilirlik testi uygulamamızın görme bozukluğu, işitme engelliler ve diğer fiziksel veya bilişsel koşullar gibi engelli olanlar dahil tüm kullanıcılar için kullanılabilir olmasını aynı zamanda yasal gereksinimlere de uygun olmasını sağlar [6].

<p align="center">
  <img src="https://user-images.githubusercontent.com/58858983/161403811-334d725b-23d0-4799-ba67-89ab36e80b6e.png">
</p>
<h5 align="center">Resim 3 Mobil Test Türleri [7]</h3>
<br>
 

## Appium Nedir ve Ne İçin Kullanılır?
Appium, bir Web Sürücüsü kullanarak hem iOS hem de Android platformlarında yerel bir mobil uygulamayı ve mobil web uygulamasını test etmeye yönelik açık kaynaklı bir otomasyon test aracıdır.

## Appium Neden Bu Kadar Özel?
Piyasada birçok test otomasyon aracı bulunmaktadır (MonkeyTalk, Robotium, KIF (Keep It Functional) ...). Ancak araçların çoğu, aracın yerel mobil uygulamayla iletişim kurabilmesi için uygulama kodunun çoğuyla derlenmesi gereken ek bir aracı gerektirir. 

Bunun dışında, Appium'u önde tutan bazı önemli farklılıklar:
-	Appium bir sunucu işlevi görür ve bir Selenium Sunucusu gibi arka planda çalışır.
-	TestNG test çerçevesi ile senkronize etme yeteneğine sahiptir.
-	Appium, ayrıntılı bir bilgi günlüğü üretebilen ve Ranorex gibi ayrıntılı bir raporlama yapısı oluşturan yerleşik bir UI Automator'a sahiptir.
-	Test kodundan backend API'lerine ve veritabanlarına tam erişim ile kontrolü ele alabilirsiniz [8].

## Appium Server ve Inspector Nasıl Başlatılır?
 
<p align="center">
  <img src="https://user-images.githubusercontent.com/58858983/161403892-68e9ccbc-b454-4f11-a71a-13ac94927433.png">
</p>
<h5 align="center">Resim 4 Appium Server GUI</h3>
<br>

Appium Server GUI ayarlarını resimdeki gibi yaparak “Start Server v1.22.2” butonuna basarak serverımızı başlatıyoruz. 

<br>
<p align="center">
  <img src="https://user-images.githubusercontent.com/58858983/161403941-c50b87ab-4b82-49a7-8baf-4c84076f91ef.png">
</p>
<h5 align="center">Resim 5 Appium Inspector</h3>
<br>
<br>

Server başladıktan sonra Appium Inspector üzerinden yukarıdaki gibi ayarları yapmalıyız. Buradaki “appPackage” ve “appActivity” uygulamamızın başlaması ve doğru çalışması için mutlaka yazılması gereken özelliklerdir. Bunlar doğrudan uygulamamız ve projemiz üzerinden alınabilecek değerlerdir. Bu ayarları da yaptıktan sonra “Start Session” butonu üzerinden Inspector’ımızı başlatabiliriz.

Bu işlemleri yaptıktan sonra test senaryomuzu “maven” ile oluşturup, testimizi başlatabiliriz. Bu senaryo için gerekli kodlar aşağıda gibidir.


<br>
<p align="center">
  <img src="https://user-images.githubusercontent.com/58858983/161404381-caae11f7-1013-4a3d-8370-0e78b12f8398.png">
</p>
<h5 align="center">Resim 6 Maven Setup Fonksiyonu</h3>
<br>

Yukarıdaki gördüğümüz Setup fonksiyonu ile tıpkı Appium Inspector’daki gibi proje ve emulator özelliklerimizi yazıyoruz. Bu fonksiyon ile emulatore doğrudan bağlantı sağlayacağız ve yazdığımız test senaryosunun işlemlerini göreceğiz.


<br>
<p align="center">
  <img src="https://user-images.githubusercontent.com/58858983/161404408-2c494b9d-9b4c-4fa5-975b-c8f12e73ae28.png">
</p>
<h5 align="center">Resim 7 Test Senaryosu</h3>
<br>


Yukarıdaki kodlar ile senaryomuzun nasıl gerçekleşmesini istediğimizi yazıyoruz. İlk olarak driver nesnesi üzerinden ulaşmak istediğimiz ilgili view ID’lerine nesneler atıyoruz. Böylelikle doğrudan bağlantı sağlıyoruz. Sonrasında oluşturduğumuz bu nesnelere sendKeys() metodu ile view’a değer veriyoruz. Aynı zamanda “button” nesnesi ile click() metodunu çağırıyoruz. Tıklama olaylarına yanıt veriyoruz böylece. Son olarak Thread.sleep() metodu ile kaç saniye bekletmek istediğimizi yazıyoruz, işlemler sonrasındaki uygulama tepkisini görmek adına. Sonuç olarak istediğimiz senaryo gerçekleşmiş oluyor.

## Kaynaklar:

1.	https://keytorc.com/hizmetler/mobil-uygulama-testleri/
2.	https://tr.theastrologypage.com/mobile-application-testing
3.	https://www.innova.com.tr/tr/blog/mobil-uygulama-testi-yaparken-bunlara-dikkat-edin
4.	https://dinamikwebtasarim.com/mobil-test/
5.	https://www.affde.com/tr/mobile-app-usability.html
6.	https://hellospace.world/tr/blog/post/mobil-uygulamalarin-ihtiyac-duydugu-10-test-turu/da4c427fdd2
7.	https://apportunity.net/Mobile-Web-App-Testing
8.	https://blog.vsoftconsulting.com/blog/why-appium-is-preferred-over-other-mobile-test-automation-tools-1
