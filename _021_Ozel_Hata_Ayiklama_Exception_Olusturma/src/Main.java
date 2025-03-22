import java.io.IOException;
import java.util.Scanner;
/// Hata fırlatma, futbolda tac atma anlamınada gelmekte.
/// Bize try-catch ile yöneterek programın,kırılmamasını,calışmamasını,durmamasını(saglar) engeller.

public class Main {
    public static void checkAge(int age) throws AgeCheckException{// Run time hataları olmayan, haricindeki Exceptionlarda bu şekilde,
        //Dahil edilir.(throws Exception)
        /// throws ile kendi yaratmış olduğumuz except sınıfa eriştik ve kendi düzenlediğimiz şekilde kullanmaya basladık.
        if(age < 18){
            throw new AgeCheckException("Yas Hatası Alındı !");
            //Bu şekilde de hata mesajı düzenleyebiliyor.Gene Hata fırlatıldıktan sonra
            //Buradan çıkacak ve Aşşağıdaki "Yaşı uygundur." yazısı basılmayacak.
        }
        System.out.println("Yaşı uygundur.");
    }

    public static void main(String[] args) throws AgeCheckException {/// throws ile kendi yaratmış olduğumuz except sınıfa eriştik ve kendi düzenlediğimiz şekilde kullanmaya basladık.
        Scanner input = new Scanner(System.in);
        System.out.println("Yaşınızı Giriniz: ");
        int age = input.nextInt();
        try{
            checkAge(age);
        }catch(AgeCheckException e){
            System.out.println(e.toString());
        }
        System.out.println("Program Bitti");
    }
}