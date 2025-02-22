package _008_Metot_Overriding_Metod_Ezme;

public class Main {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("a",4322,"asf@asd.cm");
        Ogretim_gorevlisi o1 = new Ogretim_gorevlisi("b",3523,"ytryr@cas.com","Bil Müh","Prof",6);

        //metot overloading (metotlarda aşırı yükleme)
        o1.giris();//1) Çıktısı:Akademisyen sınıfından gelen Override: b Adlı Akademisyen C kasından Giriş Yapmıştır!
        o1.giris("21:30");//2) Çıktısı:b Adlı  21:30 Saatinde Sisteme Giriş Yapmıştır.
        o1.giris("21:30","00.00");//3) Çıktısı:b Adlı  21:30 Saatinde Sisteme Giriş Yapmıştır. VE 00.00Saatinde Çıkış Yapmıştır.

        //Şöyle açıklayayımm.1)de çalışan metotta ilk önce o1'i okuyor. o1 "Ogretim_Gorevlisi" sınıfının nesnesi,O yüzden onun üst sınıfı var mı?
        //ona bakıyor. Evet var "Akademisyen" sınıfından extends edilmiş.Ona gidiyor, Orada giris metodunu görüyor.
        //Bu giris metodu override edilmiş, Bakıyorki "Akademisyen" sınıfıda "Calisandan" extends edilmiş 3 farklı parametreli method şeklinde
        //Bunları toplayarak geliyor.Tekrar Akademisyene uğradığında alt sınıfında özelleştiğini görüyor ve değişerek devam ediyor.
        //Sonuc olarakta 1 nolu çıktıda alt sınıfın özelleşip değiştiği çıktısını sunarken.
        //2 ve 3 nolu çıktıda Ana clastan toplayarak getirdiği metot çıktısını sunuyor.

        //Ben kafamda bu şekilde hayal edip çalıştırmıştım
        //eğitmenin anlattığına göre "Ogretim_Gorevlisi" sınıfı neyi extend ediyor "Akademisyen" sınıfını. Gidiyor ona bakıyor.
        //"Akademisyen" sınıfında var mı? var onu yazıyor. Diğer parametreler'i sağlayan metot yok ise bu seferde.
        //"Akademisyen" sınıfın extends ettiği "Calisan" Sınıfına gidiyor ve oraya bakıyor.

        //ÖNEMLİ BU MEVZUYA SON NOKTA: ilk önce referans olduğu sınıfa bakıyor, böyle bir metot var mı? diye hata almıyorsa böyle bir metot vardır.
        //en alt tabakadan, referans aldığı sınıfa bakıyor varsa basıyor.
        //yok ise onun bir üst sınıfı olan "Akademisyene gidiyor" yine aynı şekil varsa basıyor, yok ise bir üst sınıfa gidiyor.
        //onunda üst sınıfı olan sın çare 'Calisan' sınıfına geliyor, buraya bakıyor metot var ise basıyor. if mantığı gibi

    }
}
