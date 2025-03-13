public class Main {
    public static void main(String[] args) {
        /// Primitive ve Wrapper sınıflarıyla değişken tanımlama
        int a = 20; // int türünde primitive değişken
        Integer b = 10; // Wrapper sınıfı kullanarak Integer nesnesi oluşturduk

        ///String ve Short tipinde değişkenler tanımlama
        String str = "abc"; // String değişkeni
        Short s = 2; // Short türünde wrapper sınıfı ile değişken tanımlandı

        /// Integer değerini String'e dönüştürme işlemi (toString() metodu kullanılıyor)
        Integer c = 50; // Integer wrapper sınıfı değişkeni
        String str2 = c.toString(); // Integer türündeki değeri String'e çevirdik
        System.out.println(str2); // Çıktı: "50"

        /// String'i integer'a dönüştürme işlemi ve toplama işlemi
        String d = "85"; // Sayısal içeriğe sahip bir String tanımlandı
        int k = Integer.parseInt(d); // String olan "85" değerini integer'a çevirdik
        int l = 15; // int değişkeni tanımlandı

        /// String toplama hatasından kaçınmak için parantez kullanıyoruz
        System.out.println("1.Yol: " + (k + l)); // Çıktı: 100
        System.out.println("2.Yol: " + (Integer.parseInt(d) + l)); // Çıktı: 100
    }
}
