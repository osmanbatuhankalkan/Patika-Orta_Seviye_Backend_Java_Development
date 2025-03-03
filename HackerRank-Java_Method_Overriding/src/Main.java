public class Main {
    public static void main(String[] args) {
            //Sports Nesnesi yaratıldı
            Sports c1 = new Sports();

            //Soccer Nesenesi yaratıldı
            Soccer c2 = new Soccer();

            //nesne'nin isim 'getName()' field'ı çağrılıyor
            //Sonrasında nesnenin 'getNumberOfTeamMembers'
            //metodu çağrılıyor.
            System.out.println(c1.getName());
            c1.getNumberOfTeamMembers();

            //nesne'nin isim 'getName()' field'ı çağrılıyor
            //Sonrasında nesnenin 'getNumberOfTeamMembers'
            // metodu çağrılıyor.
            System.out.println(c2.getName());
            c2.getNumberOfTeamMembers();
    }
}
