import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start(){
        System.out.println("Oyunumuza Hoşgeldiniz.!");

        System.out.println("Lütfen bir kullanıcı ismi giriniz.");
        String playerName = input.nextLine();

        Player player = new Player(playerName);
        System.out.println(player.getName()+ " Hoşgeldiniz."+" "+"\"Oyun başlamak üzere, kendini hazırla !!!\"");

        System.out.println("Lütfen oyuna başlamak istediğiniz Karakterinizi seçiniz.");
        player.selectChar();//Player sınıfı içerisindeki selectChar methodunu çalıştırır.

        Location location = null;
        while(true){
            player.printInfo();
                System.out.println();
                System.out.println("############ Bölgeler############");
                System.out.println("1- Güvenli Ev -->> Canımızın yenilendiği güvenli bölge.");
                System.out.println("2- Eşya Dükkanı -->> Silah ve Zırh satın alınan bölge");
            System.out.println("3- Mağara -->> Ödül <Yemek>, Mağaraya Git, Dikkatli Ol Canavar Çıkabilir.");
            System.out.println("4- Orman -->> Ödül <Odun>, Orman'a Git, Dikkatli ol Vampir Çıkabilir.");
            System.out.println("5- Nehir -->> Ödül <Su>, Nehir'e Git, Dikkatli ol Ayı Çıkabilir.");
                System.out.println("0- Çıkış Yap -->> Oyunu Sonlandır.");

                System.out.println("Lütfen gitmek istediğiniz bölgeyi seciniz:");
                int selectLoc = input.nextInt();
                input.nextLine();// <<< Fazladan satırı temizle
                switch(selectLoc){

                    case 0:
                        location=null;
                        break;

                    case 1:
                        location = new SafeHouse(player);
                        break;

                    case 2:
                        location = new ToolStore(player);
                        break;
                        case 3:
                            location=new Cave(player);
                            break;
                        case 4:
                            location=new Forest(player);
                            break;
                            case 5:
                                location=new River(player);
                                break;
                    default:
                        System.out.println("Lütfen Geçerli Bir Bölge Giriniz !");

                }
                if(location == null){
                    System.out.println("Oyun Sonlanmıştır. Tekrar Görüşmek Dileğiyle.");
                    break;
                }
                //location.onLocation();//location'ın onLocation metodunu çağırabiliyoruz, çünkü hepsine ortak.

            if(!location.onLocation()){
                System.out.println("Game Over!");
                break;
            }
        }

    }

}
