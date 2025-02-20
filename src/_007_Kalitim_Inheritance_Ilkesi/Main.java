package _007_Kalitim_Inheritance_Ilkesi;

public class Main {
    public static void main(String[] args) {
        Akademisyen a1= new Akademisyen("akademisyen",050023,"akademisyen@asd.com","Bilgisayar Mühendisliği","Prof.");
        Calisan c1= new Calisan("Calisan",040023,"Calisan@asd.com");
        Memur m1= new Memur("Memur",030023,"Memur@asd.com","Kutuphane","9.00-12.00");
        Ogretim_gorevlisi o1= new Ogretim_gorevlisi("Ogretim gorevlisi",050023,"Ogretim_gorevlisi@asd.com","Makine Mühendisliği","Doç.",5);
        Asistan ast1= new Asistan("Asistan",020023,"Asistan@asd.com","Bilgisayar Mühendisliği","Ast.","13.00-17.00");
        Lab_Asistan ast_lab1= new Lab_Asistan("Lab Asistan",010023,"Lab_Asistan@asd.com"," Mimarlık","Lab.Ast.","11.00-15.00");
        Bilgi_Islem b1= new Bilgi_Islem("Bilgi Islem",07002,"Bilgi_Islem@asd.com","Bilgi İşlem ","9.00-17.00","Kurulum");
        Guvenlik_gorevlisi g1= new Guvenlik_gorevlisi("Guvenlik gorevlisi",000023,"Guvenlik_gorevlisi@asd.com","Bilgisayar Mühendisliği","9.00-17.00","Silah Taşıma");

        System.out.println("*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*");
        a1.getAdSoyad();
        a1.derseGir();
        a1.getBolum();
        a1.yemekhane();
        a1.cikis();
        a1.giris();
        System.out.println("*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*");
        c1.getAdSoyad();
        c1.cikis();
        c1.giris();
        c1.getEmail();
        c1.yemekhane();
        System.out.println("*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*");
        m1.getAdSoyad();
        m1.cikis();
        m1.giris();
        m1.getEmail();
        m1.getDepartman();
        System.out.println("*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*");
        o1.getAdSoyad();
        o1.derseGir();
        o1.yemekhane();
        o1.cikis();
        o1.giris();
        o1.getEmail();
        o1.yemekhane();
        System.out.println("*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*");
        ast1.getAdSoyad();
        ast1.derseGir();
        ast1.yemekhane();
        ast1.quizYap();
        ast1.cikis();
        ast1.giris();
        ast1.getUnvan();
        b1.getMesai();
        System.out.println("*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*");
        ast_lab1.getAdSoyad();
        ast_lab1.derseGir();
        ast_lab1.yemekhane();
        ast_lab1.quizYap();
        ast_lab1.cikis();
        ast_lab1.giris();
        ast_lab1.getUnvan();
        ast_lab1.lablaraGir();
        ast_lab1.getBolum();
        b1.getMesai();
        System.out.println("*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*");
        b1.getAdSoyad();
        b1.cikis();
        b1.giris();
        b1.getEmail();
        b1.yemekhane();
        b1.networkKurulumu();
        b1.getDepartman();
        b1.getMesai();
        System.out.println("*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*");
        g1.getAdSoyad();
        g1.cikis();
        g1.giris();
        g1.getEmail();
        g1.yemekhane();
        g1.getBelge();
        g1.getTelefon();
        g1.getMesai();
        System.out.println("*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*0*");



    }
}
