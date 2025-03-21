import java.io.IOException;
import java.util.Scanner;
/// Hata fırlatma, futbolda tac atma anlamınada gelmekte.
/// Bize try-catch ile yöneterek programın,kırılmamasını,calışmamasını,durmamasını(saglar) engeller.
public class Main {
    public static void checkAge(int age) throws Exception{// Run time hataları olmayan, haricindeki Exceptionlarda bu şekilde,
        //Dahil edilir.(throws Exception)
    if(age < 18){
        throw new IOException("Yaşınız tutmuyor.");
        //Bu şekilde de hata mesajı düzenleyebiliyor.Gene Hata fırlatıldıktan sonra
        //Buradan çıkacak ve Aşşağıdaki "Yaşı uygundur." yazısı basılmayacak.
        //Bu hatayı aşşağıda main method araciliğiyle yönetebiliriz.
    }
        System.out.println("Yaşı uygundur.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yaşınızı Giriniz: ");
        int age = input.nextInt();
        try {
            checkAge(age);
        }catch (Exception e){
            System.out.println("Yaşı Uymadı !");
            System.out.println(e.toString());
        }
        System.out.println("Program Bitti");
    }
}