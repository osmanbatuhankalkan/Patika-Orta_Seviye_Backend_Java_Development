package _007_Kalitim_Inheritance_Ilkesi;
//Bu sınıfımız, Memur sınıfın alt sınıfıdır.Oradan gelenler burada extends edildiği için tanımlıdır o özellikleri kullanabilmektedir.Burada kendine has özelliklerini tanımlayacağız.
//Bu sınıfımız bir alt sınıftır. Fakat bu sınıfımızından altında sınıflar olacağı için onlara görede üst sınıftır. Alt sınıflar üstlerini kapsar.
public class Guvenlik_gorevlisi extends Memur{
    private String belge;
    public Guvenlik_gorevlisi(String adSoyad, int telefon, String email, String departman, String mesai,String belge) {
        super(adSoyad, telefon, email,departman,mesai);//*** ÖNEMLİ= super() methodtan üst sınıftan veri çekerken kullanırız, bunuda üst sınfın hangi cons'unu kullanacaksak
        // o paramatrelerini girerek yaparız ve içeridekini this ile dışarıdan gelene eşitliyoruz.
        this.belge = belge;
    }
    public String getBelge(){
        return belge;
    }
    public void setBelge(String belge){
        this.belge = belge;
    }
    public void nobet(){
        System.out.println(getEmail()+"mailli"+getAdSoyad()+"isimli memur nöbet tutuar.");
    }
}
