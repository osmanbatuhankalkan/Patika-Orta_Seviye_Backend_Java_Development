public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");//Burada kullanıcıdan isim almamıza gerek yok o yüzden kendimiz tanımlıyoruz.
    }
    @Override
    boolean onLocation() {
        System.out.println("Güvenli Evde bulunmaktasınız.");
        System.out.println("Canınız yenileniyor...");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        return true;
    }
}
