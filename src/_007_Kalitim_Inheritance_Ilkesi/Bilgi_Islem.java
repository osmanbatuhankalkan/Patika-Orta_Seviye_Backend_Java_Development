package _007_Kalitim_Inheritance_Ilkesi;
//Bu sınıfımız, Memur sınıfın alt sınıfıdır.Oradan gelenler burada extends edildiği için tanımlıdır o özellikleri kullanabilmektedir.Burada kendine has özelliklerini tanımlayacağız.
//Bu sınıfımız bir alt sınıftır. Fakat bu sınıfımızından altında sınıflar olacağı için onlara görede üst sınıftır. Alt sınıflar üstlerini kapsar.
public class Bilgi_Islem extends Memur{
    private String gorev;
    public Bilgi_Islem(String adSoyad, int telefon, String email, String departman, String mesai,String gorev) {
        super(adSoyad, telefon, email,departman,mesai);//*** ÖNEMLİ= super() methodtan üst sınıftan veri çekerken kullanırız, bunuda üst sınfın hangi cons'unu kullanacaksak
        // o paramatrelerini girerek yaparız ve içeridekini this ile dışarıdan gelene eşitliyoruz.
        this.gorev = gorev;
    }
    public String getGorev() {
        return gorev;
    }
    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
    public void networkKurulumu(){
        System.out.println(getEmail()+"mailli"+getAdSoyad()+"Bilgi Islem Network Kurulumu Yapar.");
    }
}
