package _001_Static_Anahtar_Sozcugu;
// Static koyunca 'sınıfa' yani halka mal oldugu için halka mal olan bir şeyi herkes kullanabilir.
// Boş yere nesne yaratıp iş yükü arttırılmaz.
public class Calculate {
    public static void calcAvarage(int[] notlar){
        double sum = 0;
        for(int i:notlar){
            sum+=i;
        }
        double avarage = sum/notlar.length;
        System.out.println("Ortalama notes : " + avarage);
    }
}