package nested;
/// Outer Class
public class Static_Out {

        public int a = 5;
        public static int b =20;

        /// Inner Class
        public static class In {
            public static int  a = 10;/// içeride mothod da erişebilmek için 'static' yapmamız gerek.

            public static void run() {/// In sınıfna ait 'run()' method.

                System.out.println("Static_Out.In.run Method'u Çalışıyor.....");
                int a = 1;

                /// *** Dış sınıfta tanımlanan değişkene erişmek için dışardaki değişkeninde static olması lazım.(public static int = 20;)
                System.out.println(Static_Out.b);

                System.out.println(a);//methodu temsil eden 'a' == CEVAP method içerisindeki a yani '1'.
                System.out.println(In.a);//sınıfı temsil eden 'a' == Cevap methodun dahil olduğu sınıf a yani '10'.

            }
        }

        public void run() {/// run sınıfına ait 'run()' method.
            ///Nesne üretmeye gerek kalmadı Static olarak tanımladık. //In in = new In();///* Out classta In nesnesini çağırdık.
            In.run();///Bu nesneye ait methodu çalıştırdık.
        }
}