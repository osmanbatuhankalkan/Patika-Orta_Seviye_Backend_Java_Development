package _002_Static_Kod_Bloklari;

public class User {
    public String name;
    public static int counter = 0;// sıfırdan başladı

    //rastgele bir bir sayı yarattım
    static {
        int random = (int) (Math.random() * 100);
        System.out.println("2-Öncelikli belleğe yerleşen static kısım" +
                "Random Sayı: " + random);
        counter = random;
    }
    public User(String name) {
        this.name = name;
        System.out.println("Cons");
        counter++;//Cons her çalıştığında +1 artacak
    }
}