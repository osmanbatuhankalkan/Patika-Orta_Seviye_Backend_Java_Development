public class Nullable <T> {/// Generic bir sınıftır.'<>' T bir isimlendirme, herhangibir şey de yazabilirsin
    /// Biz burada genel bir sınıf yarattık tüm türlere hitap eden
    private final T value;

    public Nullable(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isNull(){
        return this.getValue() == null;
    }
    public void run(){
        if(isNull()){
            System.out.println("'Generic' Bu değişkene değer atanmamıştur.(null)");
        }else {
            System.out.println(this.getValue());
        }
    }
}
