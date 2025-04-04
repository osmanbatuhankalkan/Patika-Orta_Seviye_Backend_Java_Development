import java.util.Scanner;

public abstract class Location {
    private Player player;//Adında nesnemizi bu sınıfın içerisinde üretiyoruz.
    private String name;
    public static Scanner input =new Scanner(System.in);

    public Location(Player player, String name) {
        this.player = player;
        this.name = name;
    }

    abstract boolean onLocation();//tüm alt sınıflar bunu yazsın diye abstract şekilde tanımlıyoruz.

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
