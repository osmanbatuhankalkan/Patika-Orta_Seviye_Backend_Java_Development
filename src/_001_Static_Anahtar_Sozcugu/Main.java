package _001_Static_Anahtar_Sozcugu;

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Mat-101" , "MAT" , 70);
        Course fizik = new Course("FZK-101" , "FZK" , 40);
        Course kimya = new Course("KMY-101" , "KMY" , 50);

        int[] notlar={90,90,90};
        Calculate.calcAvarage(notlar);
        Course.courseList();

        // Static koyunca 'sınıfa' yani halka mal oldugu için halka mal olan bir şeyi herkes kullanabilir.
        // Boş yere nesne yaratıp iş yükü arttırılmaz.
        int[] oto_notlar={mat.note,fizik.note,kimya.note};
        Calculate.calcAvarage(oto_notlar);

        System.out.println("Online oyuncular : " + Player.onlinePlayers);
    }
}
