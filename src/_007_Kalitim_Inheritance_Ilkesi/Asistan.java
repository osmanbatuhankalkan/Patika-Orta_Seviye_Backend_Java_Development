package _007_Kalitim_Inheritance_Ilkesi;
//Bu sınıfımız, Akademisyen sınıfın alt sınıfıdır.Oradan gelenler burada extends edildiği için tanımlıdır o özellikleri kullanabilmektedir.Burada kendine has özelliklerini tanımlayacağız.
// Alt sınıflar üst sınıflarını kapsar.
public class Asistan extends Akademisyen{
    private String ofisSaati;

    public Asistan(String adSoyad, int telefon, String email, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefon, email, bolum, unvan);
        this.ofisSaati = ofisSaati;
    }
    public String getOfisSaati() {
        return ofisSaati;
    }
    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }
    public void quizYap(){
        System.out.println(getAdSoyad()+" Quiz");
    }

}
