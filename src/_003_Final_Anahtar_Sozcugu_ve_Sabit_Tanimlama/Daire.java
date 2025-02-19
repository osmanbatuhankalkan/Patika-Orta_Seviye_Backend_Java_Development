package _003_Final_Anahtar_Sozcugu_ve_Sabit_Tanimlama;

public class Daire {
    //1.2) public double pi =3.14;
    final double pi =3.14;//1.3) burada final vermemiz main classtaki pi manipülasyonunu engelliyor ve hata döndürüyor müdahaleye.
    public int r;
    public Daire(int r) {
        this.r = r;
    }
    public void daireHesaplama() {
        double hesap=(pi*this.r*this.r);
        System.out.println(hesap);
    }
}