package _008_Metot_Overriding_Metod_Ezme;

//Bu sınıfımız, Calisan sınıfın alt sınıfıdır.Oradan gelenler burada extends edildiği için tanımlıdır o özellikleri kullanabilmektedir.Burada kendine has özelliklerini tanımlayacağız.
//Bu sınıfımız bir alt sınıftır. Fakat bu sınıfımızından altında sınıflar olacağı için onlara görede üst sınıftır. Alt sınıflar üstlerini kapsar.
public class Akademisyen extends Calisan {
    private String bolum;
    private String unvan;

    public Akademisyen(String adSoyad, int telefon, String email,String bolum, String unvan) {
        super(adSoyad, telefon, email);//*** ÖNEMLİ= super() methodtan üst sınıftan veri çekerken kullanırız, bunuda üst sınfın hangi cons'unu kullanacaksak o paramatrelerini girerek yaparız.
        //içeridekini this ile dışarıdan gelene eşitliyoruz.
        this.bolum = bolum;
        this.unvan = unvan;
    }
    public String getBolum(){//Dışarodan geleni okuyabildiğimiz metotumuz, bunlar klasik temel metotlar getter setterlardır.
        return bolum;
    }
    public void setBolum(String bolum){//dışarodan geleni yazabildiğimiz metotlarımız, bunlar klasik temel metotlar getter setterlardır.
        this.bolum = bolum;
    }

    public String getUnvan(){
        return unvan;
    }
    public void setUnvan(String unvan){
        this.unvan = unvan;
    }
    public void derseGir(){
        System.out.println("Syn."+unvan+getAdSoyad()+"Lütfen"+bolum+"Dersinize Giriniz.");//**DİKKAT=Fark ettiysek bu sınıfta yaratılan fieldlara doğrudan erişebiliyoruz.
        //Fakat üst sınıftan aldığımız fieldlar encapsule edildiği için onları methot olarak çağırabiliyoruz.Extends etmesek method olarakta çağıramazdık.
    }
}
