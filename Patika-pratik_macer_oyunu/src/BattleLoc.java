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
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();

        if(selectCase.equals("S")){
            //Savaşma İşlemi Yapılıyor.
            System.out.println("Savaş Başladı.");
        }
        return true;
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
