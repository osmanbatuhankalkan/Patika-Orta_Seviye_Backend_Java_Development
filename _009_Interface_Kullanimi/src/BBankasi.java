public class BBankasi implements IBanka{
    private String bankaAdi;
    private String terminalID;
    private String password;
/// Interfaceden önce
//    public void conn(String str){
//        System.out.println("BPosu"+bankaAdi+" Java Classına Bağlandı !");
//    }
//
//    public void payment(double price){
//        System.out.println("Bankadan Cevap Bekliyor...");
//        System.out.println("İşlem başarılı !");
//    }
//
    /// Interfaceden sonra

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanıcı IP:B " + ipAddress);
        System.out.println("Makine IP"+ this.hostIpAdress);
        System.out.println(this.bankaAdi+" Bağlanıldı !");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String date, String cvc) {
        System.out.println(this.bankaAdi+" Sistemden Cevap Bekliyor...");
        System.out.println("İşlem başarılı !");
        return true;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
