public class Soccer extends Sports {
    //Alt sınıf, kalıtıyor ve @override ederek methodlarını eziyor.
    // Kendine göre (parametrelerini değiştrimeden) düzenliyor.
    // Bu olay 'run time' da oluyor, yani derlendikten sonra.
    @Override
    String getName(){
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName());
    }

}
