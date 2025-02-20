package _002_Static_Kod_Bloklari;

public class YazarIslemleri {
    private static Yazar[] yazarlar;//**STATİC değişken
    //yazarlar dizisi sınıfına aittir, nesnelere değil.
    //Tüm YazarIslemleri neseneleri bu tek diziyi paylaşır.


    static {    //**Static Blok- Sadece 1 kez çalışır, Nesne olmuşmasına gerek yoktur,
        // Yazarlar dizisini doldurur.
        yazarlar = new Yazar[5];
        yazarlar[0] = new Yazar("Reşat Nuri", "Güntekin");
        yazarlar[1] = new Yazar("Necip Fazıl", "Kısakürek");
        yazarlar[2] = new Yazar("Yakup Kadri", "Karaosmanoğlu");
        yazarlar[3] = new Yazar("Halit Ziya", "Uşaklıgil");
        yazarlar[4] = new Yazar("Yahya Kemal", "Beyatlı");
    }
    public static Yazar[] getYazarlar() {//**Static Metot, yazarlar dizisini döndürür
        //Static old. için nesne yaratmadan çağrılabilir.
        return YazarIslemleri.yazarlar;
    }
}