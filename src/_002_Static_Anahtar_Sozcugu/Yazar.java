package _002_Static_Anahtar_Sozcugu;

public class Yazar {
    private String ad;
    private String soyad;

    public Yazar(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getBilgi() {
        return this.ad + " " + this.soyad;
    }
}