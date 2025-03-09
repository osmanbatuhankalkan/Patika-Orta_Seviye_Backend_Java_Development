public class NormalLoc extends Location {

    public NormalLoc(Player player, String name) {
        super(player, name);
    }

    //üst abstract sınıfında, tanımlamış olduğumuz abstract methodu bize,
    //Override ettiriyor, yapmazsak hata dönecektir.
    @Override
    boolean onLocation() {
        return true;
    }

}
