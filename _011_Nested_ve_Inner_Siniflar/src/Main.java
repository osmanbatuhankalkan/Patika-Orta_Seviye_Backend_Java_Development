import nested.Anonim;
import nested.Local;
import nested.Out;
import nested.Static_Out;

public class Main {
    public static void main(String[] args) {
        System.out.println("#####################################################################");
        /// public class Out{}
        Out a0 = new Out();
        a0.run();
        System.out.println("#####################################################################");
        /// public class In{}
        Out a1 = new Out();
        Out.In inNesnesi = a1.new In();
        inNesnesi.run();
        System.out.println("#####################################################################");
        /// public In getIn()
        Out a2 = new Out();
        Out.In inNesnesi2 = a2.getIn();
        inNesnesi2.run();
        System.out.println("#####################################################################");
        System.out.println("#####################################################################");
        /// Static_out
        ///Static_Out o = new Static_Out();//Nesne üretmeye gerek kalmadan direk bağlanabileceğiz.
        Static_Out.In.run();
        //En dış sınıf static olmasada olur, fakar iç sınıf ve iç method 'STATİC' olmak zorunda.
        System.out.println("#####################################################################");
        System.out.println("#####################################################################");
        /// Local Sınıf
        Local l = new Local();
        l.run();
        System.out.println("#####################################################################");
        System.out.println("#####################################################################");
        /// Sadece o neseneye ait özel method ve değişkenler yaratılabilir.Genel kullanımıda abstarack classlarda, abs.clsslar burda override edilerek kullanılır.
        Anonim a = new Anonim(){/// Bu kod bloğu arasında. 'Değişken' ve 'Metot' tanımlayabiliriz.
        public int a=20;
        @Override
            public void run() {
            System.out.println(this.a);
            System.out.println("Anonim Olarak Yazılmış Run Metodu !!!");
            print();
        }
        public void print(){
            System.out.println("Print Metodu");
        }
        };
        a.run();
        /// a.print(); Fakat nesne üzerinden erişime izin vermez. Yukarıdaki gibi Override etmeye izin verir. Bu override edilen methotlara nesne üzerinden eriştirir.Ama kendi yazdıklarına ulaşamazsın.
        System.out.println("#####################################################################");
    }
}