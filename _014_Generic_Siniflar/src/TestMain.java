public class TestMain
{
    public static void main(String[] args) {
        Integer a=10;
        String b="Patika";
        Double c=3.14;
        String d="dev";
        TestGeneric<Integer,String,Double> t = new TestGeneric<>(a,b,c);
        t.setObj2(d);
        t.showInfo();

    }
}
