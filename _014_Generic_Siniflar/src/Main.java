
public class Main {
    public static void main(String[] args) {
        /// *********************************** Generic ***********************************
        Nullable<Integer> l = new Nullable<>(10);
        l.run();
        Nullable<String> s = new Nullable<>("str");
        s.run();
        System.out.println("#############################################");
        Nullable<Integer> l1 = new Nullable<>(null);
        l1.run();
        Nullable<String> s1 = new Nullable<>(null);
        s1.run();
        System.out.println("#############################################");
        /// STRİNG
        String str = "123312";
        NullableString n = new NullableString(str);
        n.run();

        System.out.println("#############################################");
        String str2 = null;
        NullableString n2 = new NullableString(str2);
        n2.run();

        System.out.println("#############################################");
        /// INTEGER
        Integer a= null;
        NullableInteger k = new NullableInteger(a);
        k.run();
        System.out.println("#################### 'Bu sürdürülebilir bir durum değil, her tür için ayrı ayrı 'Nullable' ayarlamak. Onun için 'GENERİC'lere geçiyoruz.' ####################");
        /// Veri tipini belirlemiyoruz, hangi veri tipini atarsak atalım çalışacak hale getiriyoruz. Ve artık tek bir sınıftan tüm türleri yönetebiliyoruz. Ana Mantık bu.
    }
}
/*
*       /// Undefined --> karşılığı tanımlanmamış
        String s;

        /// null
        String s1=null;

        /// empty --> karsiligi var ama içi boş
        String s2="";
* */