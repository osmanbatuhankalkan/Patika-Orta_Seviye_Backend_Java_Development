public class ABankasi implements IBanka {


    private String bankaAdi;
    private String terminalID;
    private String password;

    public ABankasi(String bankaAdi, String terminalID, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalID = terminalID;
        this.password = password;
    }
    /* Interfaceden önce
    public void connect(){
        System.out.println("APosu"+bankaAdi+" Java Classına Bağlandı !");
    }*/
    //Interfaceden sonra
    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanıcı IP:A " + ipAddress);
        System.out.println("Makine IP"+ this.hostIpAdress);
        System.out.println(this.bankaAdi+" Bağlanıldı !");
        return true;
    }
    //İnterFaceden önce
    //public void payment(double price,String cardNumber, String date, String cvc){
        //System.out.println("Bankadan Cevap Bekliyor...");
        //System.out.println("İşlem başarılı !");
    //}
    //interfaceden sonra
    @Override
    public boolean payment(double price,String cardNumber, String date, String cvc){
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
