package nested;
/// LOCAL SINIFLAR**********
public class Local {

    public void run(){

        class Yerel{
            private int a;
            public Yerel(int a){
                this.a = a;
            }

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }
        }
        Yerel y = new Yerel(15);
        System.out.println("Local Sınıf Çalıştıı......!");
        System.out.println(y.getA());
    }

    public void print(){
        /// Yerel yerel = new Yerel(16);
        /// mesela bu çalışmayacak çünkü Yerel sınıfı run () method içerisnde Local bir şekilde.
    }
}
