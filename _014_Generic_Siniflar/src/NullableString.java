public class NullableString {

    private final String value;

    public NullableString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    public boolean isNull() {
        return this.getValue() == null;
    }

    public void run() {
        if(isNull()) {
            System.out.println("(String) " +
                    "Bu değişkene değer atanmamıştır. (null)");
        }else {
            System.out.println(this.getValue());
        }
    }
}
