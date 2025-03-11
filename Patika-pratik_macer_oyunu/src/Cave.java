public class Cave extends BattleLoc {//Mağra Sınıfımız
    public Cave(Player player) {
        super(player,"Mağara",new Zombie(),"Food",3);//BattleLoc'ta Parametre olarak Obstacle sınıfını vermiş ve erişmiştik.
        //Onun sayesinde burada Mağara sınıfında, super ile battleLoc constructor'ına buradan değer verebiliyor birbiriyle iletişimini sağlayabiliyoruz.
    }
}
