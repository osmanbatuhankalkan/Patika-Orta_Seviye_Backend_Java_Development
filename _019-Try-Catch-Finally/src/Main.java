import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /// 1.Durum

        //int a =0;
        //int b =20;
        //System.out.println(b/a);
        //System.out.println("Program Bitti.");
        //Burada hata alacağımızı biliyoruz fakat programın calısmasına devam etmek istiyoruz.
        //Bu durumda try-catch kullanırız.

        System.out.println("#################################################################");
        System.out.println("#################################################################");
        /// 1.Durum cozum: hatanın alıcağı yeri try-catch içerisine alıyoruz.
        System.out.println("Program Başladı.");
        int a=0;
        int b=20;

        try {//mantığını şu şekil akılda tutabiliriz.Hata var mı yok mu bir dene,test et gibi çalışır.Yakalanırsa catch et.
            System.out.println("Bölme İşlemi");
            System.out.println(b/a);//Burada hata alınır alınmaz. Program catch içerisine giriyor.
            System.out.println("Bölme işlemi Bitti.");
        }catch (Exception e) {
            System.out.println("Hata Ayıklama.");//Try ile hata yakalanır. Catch ile bu hataya ne yapmamız gerektiği belirtilir.
        }
        System.out.println("Program Bitti.");

        System.out.println("#################################################################");
        System.out.println("#################################################################");
        /// 2.Durum- birden çok kontrol olabilir, bir den çok catch controlde yazılabilir.
        Scanner input = new Scanner(System.in);
        int d=2;
        int e=20;;
        int c;
        int[] arr=new int[2];
        try{
            System.out.println("Bölme İşlemi");
            System.out.println(e/d);
            System.out.println("Bölme İşlemi Bitti.");
            c=input.nextInt();
            arr[10]=11;
        }catch (ArithmeticException e2){
            System.out.println("Aritatik Hata Alındı !");
            System.out.println(e2.getMessage());
        }catch (InputMismatchException e2){
            System.out.println("Yanliş Veri Girildi !");
            System.out.println(e2.getMessage());
        }catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("Array Hatası Alındı.");
            System.out.println(e2.getMessage());
        }
        System.out.println("#################################################################");
        System.out.println("#################################################################");
        /// 3.Durum- Oluşma potansiyeli olan, her durum için tek tek yazmak yerine, genel yargı kullanarak, ata sınıfını veriyoruz.
        // Tabi yine Hata alınca,tek tek catch'lemek zorunda kalabiliriz.

        Scanner input3 = new Scanner(System.in);
        int k=2;
        int l=20;;
        int m;
        int[] arr3=new int[2];
        try{
            System.out.println("Bölme İşlemi");
            System.out.println(l/k);
            System.out.println("Bölme İşlemi Bitti.");
            m=input.nextInt();
            arr3[10]=11;
        }catch (Exception e3){
            System.out.println(e3.getMessage());
        }finally {
            System.out.println("Bu kısım doğruda olsa, yanlısta olsa her daim çalısacak kısım");
        }
        System.out.println("#################################################################");
        System.out.println("#################################################################");

    }
}