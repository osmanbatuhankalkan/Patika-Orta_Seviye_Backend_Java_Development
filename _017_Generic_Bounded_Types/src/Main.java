
public class Main {
    public static void main(String[] args) {
        //Number:Integer,Double,Float extends Number
        Integer a=null;
        Nullable <Integer> n1 = new Nullable<>(a);
        // Nullable <String> n1 = new Nullable<>(a); HATA ALIRIZ: Type parameter 'java. lang.
        // String' is not within its bound; should extend 'java. lang. Number'
        //Generic sınıfımız Number'ı extends alıyor. String bu kategoriye girmiyor.
        n1.run();
    }
}