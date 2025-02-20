package _007_Kalitim_Inheritance_Ilkesi;
//Bu sınıfımız, Asiatan sınıfın alt sınıfıdır.Oradan gelenler burada extends edildiği için tanımlıdır o özellikleri kullanabilmektedir.Burada kendine has özelliklerini tanımlayacağız.
// Alt sınıflar üst sınıflarını kapsar.
public class Lab_Asistan extends Asistan {

    public Lab_Asistan(String adSoyad, int telefon, String email, String bolum, String unvan,String ofisSaati) {
        super(adSoyad, telefon, email, bolum, unvan, ofisSaati);
    }
    public void lablaraGir(){
        System.out.println(getAdSoyad()+"Laba girmeyle yetkili kişi.");
    }
}
