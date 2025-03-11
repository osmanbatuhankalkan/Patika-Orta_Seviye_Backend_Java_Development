import java.util.Random;

public abstract class BattleLoc extends Location {//Savas bölgelerinide bağlıyoruz.
    private Obstacle obstacle;
    private String award;
    private int maxObstacles;

    public BattleLoc(Player player,String name, Obstacle obstacle, String award,int maxObstacles) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacles = maxObstacles;
    }
    @Override
    public boolean onLocation() {//Başta Abstract olarak yarrtığımız için, extends ettiğimizde @override etmek zorundayız.
        int obsNumber = this.randomMaxObstacleNumber();

        System.out.println("Şuan buradasınız: " +this.getName());//Location adı bastırılır.
        System.out.println("Dikkatli Ol! Burada "+obsNumber+" Tane "+this.getObstacle().getName()+" Yaşıyor !");//Hangi mekanda, hangi Canavarımızla karşılaşılıyor onu bastırıyoruz.
        System.out.println("<S>avaş veya <K>aç");
        String selectCase = input.nextLine().toUpperCase();

        if(selectCase.equals("S")&& combat(obsNumber)){
            //Savaşma İşlemi Yapılıyor.
            System.out.println("Savaş Başladı.");
            System.out.println(this.getName() + " Tüm Düşmanları Yendiniz...!!!!");
            return true;

        }
        if(this.getPlayer().getHealth()<0){
            System.out.println("Öldünüz..!!!");
            return false;
        }
        return true;
    }

    public boolean combat(int obsNumber){//Bu döngü kaç canavar var ise o kadar savaşmamızı sağlayacak.

        for (int i = 1; i <=obsNumber; i++) {
            //Ölen canavardan, sonra gelen canavarın canı yenilensin diye ;
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());//Orjinal canla değiştiriyoruz. 2.,3., vs canavar geldiğinde 1. canavar ölünce 0 değeri sürekli dönmesin diye
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealth()>0 && this.getObstacle().getHealth()>0){//Kaç kere döneceğini bilmediği için while. oyuncu ve canavarın can sağlığı 0 dan büyük olduğu sürece devam edecek.
                System.out.println("<V>ur yada <K>aç");
                String selectCombat = input.nextLine().toUpperCase();

                if(selectCombat.equals("V")){
                    System.out.println("Siz Vurdunuz...!!!");
                    this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getTotalDamage());
                    afterHit();
                    if(this.getObstacle().getHealth()>0){
                        System.out.println();
                        System.out.println("Canavar Size Vurdu...!!!");
                        int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();//Burada canavarın vuruşundan bizim zırhımızın değerini çıkardık.
                        if(obstacleDamage<0){//Burada ise zırh, vuruşundan yüksekse - değerlerle uğraşmayalım diye 0 olarak atadık.
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth()-obstacleDamage);
                        afterHit();
                    }
                }
                else {return false;}
            }
            if(this.getObstacle().getHealth()< this.getPlayer().getHealth()){
                System.out.println("Düşmanı Yendiniz...!!!");
                System.out.println(this.getObstacle().getAward() +" Para Kazandınız...!!!");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getObstacle().getAward());
                System.out.println("Güncel Paranız: "+this.getPlayer().getMoney());
            }
        }
        return false;
    }
    public void afterHit(){
        System.out.println("Canınız :"+ this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName()+" Canı :" + this.getObstacle().getHealth());
        System.out.println("-------------------------------------");
    }
    public void playerStats(){
        System.out.println("------------------------------------");
        System.out.println("Oyuncu Değerleri: "+this.getPlayer().getName());
        System.out.println("------------------------------------");
        System.out.println("Sağlık :"+this.getPlayer().getHealth());
        System.out.println("Silah: "+this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasar :"+this.getPlayer().getTotalDamage());
        System.out.println("Zırh: "+this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama: "+this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para :+"+this.getPlayer().getMoney());

        if(this.getPlayer().getInventory().getWeapon().getDamage()>0){
            System.out.println("Silah : "+this.getPlayer());
        }
    }
    public void obstacleStats(int i){
        //System.out.println(i + ". "+ this.getObstacle().getName() + "Değerleri");
        System.out.println("------------------------------------");
        System.out.println(i+"."+"Canavar Değerleri: "+ this.getObstacle().getName());
        System.out.println("------------------------------------");
        System.out.println("Sağlık :"+this.getObstacle().getHealth());
        System.out.println("Hasar :"+this.getObstacle().getDamage());
        System.out.println("Ödül :+"+this.getObstacle().getAward());
    }

    public int randomMaxObstacleNumber() {
        Random r = new Random();
        return r.nextInt(this.getMaxObstacles())+1;//**Önemli bilgi: Random sınıfında böyle nextInt() kullandığımızda içeriye yazdığımız sayının anlamı (n-1) e karşılık geliyor.
        //yani 3 yazınca 0,1,2 değerlerinden biri gelebilir demek. Biz onu 3 yapabilmek için +1 koyuyoruz.
    }
    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacles() {
        return maxObstacles;
    }

    public void setMaxObstacles(int maxObstacles) {
        this.maxObstacles = maxObstacles;
    }
}
