public class Main {
    public static void main(String[] args) {
    /// Test-1: size(), getCapacity(), add()
                MyList<Integer> liste = new MyList<>();
                System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
                System.out.println("Dizideki Eleman Sayısı : " + liste.size());

                liste.add(10);
                liste.add(20);
                liste.add(30);
                liste.add(40);

                System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
                System.out.println("Dizideki Eleman Sayısı : " + liste.size());

                for (int i = 0; i < 7; i++) {
                    liste.add((i + 1) * 10);
                }

                System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
                System.out.println("Dizideki Eleman Sayısı : " + liste.size());

                System.out.println("##################################################################################");
                System.out.println("##################################################################################");

                /// Test-2: remove(), set(), get()
                 MyList<Integer> liste2 = new MyList<>();
                liste2.add(10);
                liste2.add(20);
                liste2.add(30);
                System.out.println("2. indisteki değer : " + liste2.get(2));
                liste2.remove(2);
                liste2.add(40);
                liste2.set(0, 100);
                System.out.println("2. indisteki değer : " + liste2.get(2));
                System.out.println(liste2.toString());

                System.out.println("##################################################################################");
                System.out.println("##################################################################################");

                /// Test-3: indexOf(), lastIndexOf(), contains()
                MyList<Integer> liste3 = new MyList<>();
                liste3.add(10);
                liste3.add(20);
                liste3.add(30);
                liste3.add(20);
                liste3.add(40);
                System.out.println("İlk 20'nin indexi: " + liste3.indexOf(20));
                System.out.println("Son 20'nin indexi: " + liste3.lastIndexOf(20));
                System.out.println("Listede 30 var mı? " + liste3.contains(30));

    }
}
