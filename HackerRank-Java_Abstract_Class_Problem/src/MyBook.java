//abstract class Book{
//    String title;
//    abstract void setTitle(String s);
//
//    String getTitle(){
//        return title;
//    }
//}

//abstract metod bulunduğu için onu extends edip kullanmak zorundayız.
//Book soyut sınıfında okuma işini 'titile' field'ı yapıyor extend ettiğimiz için bu sınıf içerisinde kullanabiliyoruz
//methodumda içerdeki 'title' field'ını dışardan gelen 's' field'ına eşitledim.

class MyBook extends Book{
    public void setTitle(String s){
        this.title=s;
    }
}
