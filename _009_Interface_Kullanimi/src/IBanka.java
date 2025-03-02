public interface IBanka {
    //fark ettiysek bunlar bizim bir şablonumuz oldu. İçerik detay yazmadık. Aynı abstruct gibi
    //Biz bunlara değişken tanımlayamayız.
    //const. interface de bulunmaz, genelde değiştirimeyecek şeyler tanımlanır.
    final String hostIpAdress = "127.0.0.1";//değişmeyecek şey
    boolean connect(String ipAddress);
    boolean payment(double price,String cardNumber, String date, String cvc);
}
