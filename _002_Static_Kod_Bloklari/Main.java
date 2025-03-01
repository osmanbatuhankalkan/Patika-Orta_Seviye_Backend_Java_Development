package _002_Static_Kod_Bloklari;
public class Main {
    public static void main(String[] args) {
        //User sınıfnı kapsayan kısım
        System.out.println("1-Test_Sınıfı tektikleyen kısım");
        User u1 = new User("u_name1");
        User u2 = new User("u_name1");
        User u3 = new User("u_name1");
        User u4 = new User("u_name1");
        System.out.println("3-Tek Static, Geri kalan dönüşler Cons için");
        System.out.println("(üretilen random değer)+(u1+u2+u3+u4)"+"="+User.counter);//random sayıya +4 koyulacak

        //YazzarIslemleri ve Yazar Sınıflarını kapsayan kısım
        Yazar[] yazarlar = YazarIslemleri.getYazarlar();
        System.out.println("Yazar Listesi");
        for (Yazar yazar : yazarlar) {
            System.out.println(yazar.getBilgi());
        }
    }
}