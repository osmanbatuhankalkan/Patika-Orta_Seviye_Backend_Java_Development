package _007_Kalitim_Inheritance_Ilkesi;
//Bu sınıfımız, Calisan sınıfın alt sınıfıdır.Oradan gelenler burada extends edildiği için tanımlıdır o özellikleri kullanabilmektedir.Burada kendine has özelliklerini tanımlayacağız.
//Bu sınıfımız bir alt sınıftır. Fakat bu sınıfımızından altında sınıflar olacağı için onlara görede üst sınıftır. Alt sınıflar üstlerini kapsar.
public class Memur extends Calisan {
    private String departman;
    private String mesai;

    public Memur(String adSoyad, int telefon, String email, String departman, String mesai) {
        super(adSoyad, telefon, email);//*** ÖNEMLİ= super() methodtan üst sınıftan veri çekerken kullanırız, bunuda üst sınfın hangi cons'unu kullanacaksak o paramatrelerini girerek yaparız.
        //içeridekini this ile dışarıdan gelene eşitliyoruz.
        this.departman = departman;
        this.mesai = mesai;
    }
    public String getDepartman() {
        return departman;
    }
    public void setDepartman(String departman) {
        this.departman = departman;
    }
    public String getMesai(){
        return mesai;
    }
    public void setMesai(String mesai){
        this.mesai = mesai;
    }
    public void calis(){
        System.out.println("Syn."+getAdSoyad()+"Lütfen"+departman+"Sorumlu Olduğunuz Bölgeye Gidiniz."+mesai+"");//**DİKKAT=Fark ettiysek bu sınıfta yaratılan fieldlara doğrudan erişebiliyoruz.
        //Fakat üst sınıftan aldığımız fieldlar encapsule edildiği için onları methot olarak çağırabiliyoruz.Extends etmesek method olarakta çağıramazdık.
    }
}
