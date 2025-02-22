package _008_Metot_Overriding_Metod_Ezme;

//Bu sınıfımız, Akademisyen sınıfın alt sınıfıdır.Oradan gelenler burada extends edildiği için tanımlıdır o özellikleri kullanabilmektedir.Burada kendine has özelliklerini tanımlayacağız.
// Alt sınıflar üst sınıflarını kapsar.
public class Ogretim_gorevlisi extends Akademisyen {
    private int kapiNo;

    public Ogretim_gorevlisi(String adSoyad, int telefon, String email, String bolum, String unvan, int kapiNo) {
        super(adSoyad, telefon, email, bolum, unvan);//*** ÖNEMLİ= super() methodtan üst sınıftan veri çekerken kullanırız, bunuda üst sınfın hangi cons'unu kullanacaksak
        // o paramatrelerini girerek yaparız ve içeridekini this ile dışarıdan gelene eşitliyoruz.
        this.kapiNo = 0;
    }
    public int getKapiNo() {//Dışarodan geleni okuyabildiğimiz metotumuz, bunlar klasik temel metotlar getter setterlardır.
        return kapiNo;
    }
    public void setKapiNo(int kapiNo) {//dışarodan geleni yazabildiğimiz metotlarımız, bunlar klasik temel metotlar getter setterlardır.
        this.kapiNo = kapiNo;
    }
    public void senatoToplantisi(){
        System.out.println(getAdSoyad()+"Adlı Öğretim Görevlimiz Lütfen Toplantımızı Kaçırmayınız.");//**DİKKAT=Fark ettiysek bu sınıfta yaratılan fieldlara doğrudan erişebiliyoruz.
        //Fakat üst sınıftan aldığımız fieldlar encapsule edildiği için onları methot olarak çağırabiliyoruz.Extends etmesek method olarakta çağıramazdık.
    }
    public void sinavYap(){
        System.out.println("Hatırlatma"+getAdSoyad()+"Adli Öğretim Görevlimiz Lütfen Sınavları belirtilen Tarih aralığında Sınav yapar.");//**DİKKAT=Fark ettiysek bu sınıfta yaratılan fieldlara doğrudan erişebiliyoruz.
        //Fakat üst sınıftan aldığımız fieldlar encapsule edildiği için onları methot olarak çağırabiliyoruz.Extends etmesek method olarakta çağıramazdık.
    }
    public void giris(String girisSaati){
        System.out.println("Ogretim_gorevlisi sınıfından gelen Override: "+this.getAdSoyad()+" Adlı Akademisyen C kasından Giriş Yapmıştır!");
    }
}
