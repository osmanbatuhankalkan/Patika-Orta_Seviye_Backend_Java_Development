import java.util.Scanner;

public class Player {

    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;

    public Player(String name){
        this.name = name;
        this.inventory = new Inventory();//player yaratıldığında otomatik olarak onun yumruk değeride gelsin
    }
    public void selectChar(){
        GameChar[] charList = {new Samurai(), new Archer(),new Knight(),new TestCharacter()};//Polymorpishm sayesinde üst sınıftan türemişleri kullanabildik.
        System.out.println("---------------------------------------------------------------------");
        System.out.println("-------------------------- Karakterlerimiz --------------------------");
        System.out.println("---------------------------------------------------------------------");
        for(GameChar gameChar : charList){
            System.out.println(
                    " \t ID :" + gameChar.getId()+
                    " \t Karakter :" + gameChar.getName()+
                    " \t Hasar :" + gameChar.getDamage()+
                    " \t Sağlık :" + gameChar.getHealth()+
                    " \t Para :" + gameChar.getMoney());
        }
        //şimdi bunları bir karar mekanizmasıyla seçtirelim.
        System.out.println("---------------------------------------------------------------------");
        int selectChar = input.nextInt();
        switch(selectChar){
            case 1:
                initPlayer(new Samurai());
                break;

                case 2:
                    initPlayer(new Archer());
                    break;

                    case 3:
                        initPlayer(new Knight());
                        break;
                        default:
                            System.out.println("Yanlıs tuslama");
        }
        System.out.println("Seçmiş olduğunuz Karakter: "+this.getName()+","+
                "\t Hasar: "+this.getDamage()+","+
                "\t Sağlık: " +this.getHealthy()+","+
                "\t Para: "+this.getMoney());
    }
    //Yeni bir method yaratalım seçilen karakterin özelliklerini getirsin ve bu sınıfta eşleştirsin
    //EZBERE GİTME böyle yazdın burada değil hazır olanı çağırıcaz, kullanıcıaz:"(public void initPlayer(String charName, int damage, int health, int money)"
    public void initPlayer(GameChar gameChar){
        this.setName(gameChar.getName());
        this.setDamage(gameChar.getDamage());
        this.setHealthy(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
    }

    public void printInfo(){
        System.out.println(
                "Silahınız: " + this.getInventory().getWeapon().getName()+
                        ", Zırh : " + this.getInventory().getArmor().getName()+
                        ", Bloklama: "+this.getInventory().getArmor().getBlock()+
                        ", Hasarınız: " + this.getDamage()+
                        ", Sağlık: " + this.getHealthy() +
                        ", Para : " + this.getMoney()
        );
    }

    public int getDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return health;
    }
    public void setHealthy(int healthy) {
        this.health = healthy;
    }

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }
    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}

/*
         switch(selectLoc){
        case 1:
//Burada player kısmına karşılık gelen parametreye sadece 'this' yazılması demek,
// o anki player'ın karşılığı kim ise onu getirir verir demektir.
location = new SafeHouse(this);
                        break;
                                case 2:
location = new ToolStore(this);
                        break;
default:
location = new SafeHouse(this);
                }
                        location.onLocation();//location'ın onLocation metodunu çağırabiliyoruz, çünkü hepsine ortak.
*/
