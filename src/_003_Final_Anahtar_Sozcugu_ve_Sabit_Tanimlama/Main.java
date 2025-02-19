package _003_Final_Anahtar_Sozcugu_ve_Sabit_Tanimlama;

public class Main {
    public static void main(String[] args) {

        //1.1)Manipüle edilmeden önce doğru bir şekilde hesaplama yapıp '314.0' sonucunu veriyor. Fakat 'FİNAL' Kullanmadığımız için
        //1.2)Methottan gelen pi'ye müdahale edebiliyoruz
        Daire d = new Daire(10);
        //1.2)d.pi=100; Müdahale sonucu '10000.0' çıktısını alıyoruz. İŞTE BUNUN ÖNÜNE ŞİMDİ 'FİNAL' ile geçeceğiz.
        //1.3) d.pi=100; Daire sınıfındaki final müdahalesi sonucu bu işlemi değiştirmeye izin vermez hata dönder.
        d.daireHesaplama();
    }
}