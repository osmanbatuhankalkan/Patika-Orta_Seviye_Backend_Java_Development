public class AgeCheckException extends Exception {//en Ata sınıftan extends ediyoruz.
    public AgeCheckException(String message) {

        super(message);//Constructor'ımızda super methodla erişim sağlıyoruz.
    }
    /// Override'la kendi toString()'imizi özelleştirelim
    @Override
    public String toString(){
        return "Bu AgeCheck sınıfına ait bir Exception !!";
    }
}
