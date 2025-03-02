import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Tutarı Giriniz: ");
        double price = input.nextDouble();
        input.nextLine(); // ENTER karakterini temizle

        System.out.println("Kart no Giriniz: ");
        String cardNumber = input.nextLine(); // Kullanıcının girdiğini düzgün alır


        System.out.print("Son Kullanma Tarihi: ");
        String date = input.nextLine();

        System.out.print("Güvenlik Kodu Giriniz: ");
        String cvc = input.nextLine();

        System.out.print("1. 'A' Bankası\n"+
                "2. 'B' Bankası\n"+
                "3. 'C' Bankası\n");

        int test=0;
        while(test<3) {
            int selectBank = input.nextInt();
            switch (selectBank) {
                case 1:
                    ABankasi aPos = new ABankasi("A Bankasi", "15523523", "8753");
                    aPos.connect("");
                    aPos.payment(price, cardNumber, date, cvc);
                    break;

                case 2:
                    BBankasi bPos = new BBankasi();
                    bPos.setBankaAdi("B Bankasi");
                    bPos.connect("");
                    bPos.getPassword();
                    bPos.payment(price, cardNumber, date, cvc);
                    break;
                default:
                    System.out.println("Geçerli bir banka giriniz !");

            }
            test++;
        }
        }
}