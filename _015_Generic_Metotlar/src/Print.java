public class Print {
    /// Generic Metot'umuzu oluşturuyoruz.Ve sonrasında main'de çağırıyoruz.
    public static <T> void printArray(T[] arr) {//nesne oluşturmadan direk çağırmak için,
        // static olarak tanımlıyoruz.
        for(T i: arr){/// Artık T türünde oluşturduğumyz veri tipimiz.
            System.out.println(i);
        }
    }
}
