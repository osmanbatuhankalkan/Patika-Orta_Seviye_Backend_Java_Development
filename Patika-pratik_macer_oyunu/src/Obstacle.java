public class Obstacle {//Bu sınıfnımız canavalar sınıfının ANA claası olacak. Diğerleri buradan türeyecek
    private int id;
    private String name;
    private int damage;
    private int health;
    private int award;
    private int originalHealth;

    public Obstacle(int id,String name, int damage, int health,int award) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.originalHealth = health;
        this.award = award;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health < 0) {//Burada amaç canavara vurduk canı - kalmasın onu 0 ye çekiyor hemen
            health=0;
        }
        this.health = health;
    }
}
