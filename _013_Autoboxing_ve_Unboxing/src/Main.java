public class Main {
    public static void main(String[] args) {

        ///1- Autoboxing → int otomatik olarak Integer nesnesine çevrilir.
        ///2- Boxing → int elle Integer.valueOf() ile Integer nesnesine çevrilir.
        ///3- AutoUnboxing → Integer otomatik olarak int değişkenine çevrilir.
        ///4- Unboxing → Integer manuel olarak intValue() metodu ile int değişkenine çevrilir.

        ///Autoboxing (Otomatik Kutulama)
        int a = 10; // Primitive int değişkeni
        Integer b = a; // int → Integer dönüşümü (Autoboxing)
        // Java, primitive int değerini otomatik olarak Integer nesnesine dönüştürür.
        System.out.println("Autoboxing: " + b); // Çıktı: Autoboxing: 10

        ///Boxing (Manuel Kutulama)
        Integer c = Integer.valueOf(a); // int → Integer dönüşümü (Boxing)
        // Boxing işlemi, primitive bir veriyi manuel olarak bir Wrapper sınıfına dönüştürmektir.
        System.out.println("Boxing: " + c); // Çıktı: Boxing: 10

        ///AutoUnboxing (Otomatik Kutudan Çıkarma)
        int d = c; // Integer → int dönüşümü (AutoUnboxing)
        // Java, Integer nesnesini otomatik olarak primitive int'e çevirir.
        System.out.println("AutoUnboxing: " + d); // Çıktı: AutoUnboxing: 10

        ///Unboxing (Manuel Kutudan Çıkarma)
        int i = c.intValue(); // Integer → int dönüşümü (Unboxing)
        // Unboxing, bir Wrapper sınıfındaki değeri manuel olarak primitive türüne çevirmektir.
        System.out.println("Unboxing: " + i); // Çıktı: Unboxing: 10
        System.out.println("#####################################################################################################################");
        /// ******************* Unboxing ve AutoUnboxing arasındaki fark *******************
        /// Unboxing ve AutoUnboxing aslında aynı şeyi yapıyor, ancak biri otomatik, diğeri manuel.
        //AutoUnboxing
        // int d = c; // Integer → int dönüşümü (AutoUnboxing)

        // Burada c bir Integer nesnesidir ama Java otomatik olarak bunu int veri tipine çeviriyor.
        // Bunun için intValue() metodunu çağırmamıza gerek yok!
        // Java derleyicisi bunu arka planda kendisi yapıyor.

        //Unboxing
        // int i = c.intValue(); // Integer → int dönüşümü (Unboxing)

        // Burada manuel olarak intValue() metodunu çağırarak Integer nesnesinden int elde ediyoruz.
        // Bunu yapmak zorunda değiliz, çünkü AutoUnboxing zaten aynı işlemi yapıyor.
        // Ama bazen explicit (açıkça) dönüşüm yapmak gerekebilir, örneğin refleksiyon veya generics kullanırken.
    }
}
