package nested;

/// Outer Class
public class Out {
    public int a = 5;

    /// Inner Class
    public class In{
        public int a = 10;

        public void run(){/// In sınıfna ait 'run()' method.
            int a=1;
            System.out.println("In Class Run Method Local 'a': "+a);//methodu temsil eden 'a' == CEVAP method içerisindeki a yani '1'.
            System.out.println("In Class 'a': "+this.a);//sınıfı temsil eden 'a' == Cevap methodun dahil olduğu sınıf a yani '10'.
            System.out.println("Out Class 'a': "+Out.this.a);///*** Bu kullanım önemli. Eğer Dış Sınıf var ve onun değerini çağırmak istiyorsak.
            ///("Sınıf ismi" + '.' + "this" + "x(o anki değişken ne ise)")
            //Out.this.run();///Method çağrımı
        }
    }
    public void run(){/// run sınıfına ait 'run()' method.
        In in = new In();///* Out classta In nesnesini çağırdık
        in.run();///Bu nesneye ait methodu çalıştırdık.
    }

    public In getIn(){
        return new In();
    }

}
