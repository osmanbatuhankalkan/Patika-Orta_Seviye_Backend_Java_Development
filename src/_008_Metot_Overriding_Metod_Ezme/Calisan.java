package _008_Metot_Overriding_Metod_Ezme;

    //Ana CLaasımız budur.Ortak En temel ozellikler buradan alt sınıflara dağıtılacaktir.
    public class Calisan {
        private String adSoyad;
        private int telefon;
        private String email;


        public Calisan(String adSoyad, int telefon, String email) {
            //içeridekini this ile dışarıdan gelene eşitliyoruz.
            this.adSoyad = adSoyad;
            this.telefon = telefon;
            this.email = email;

        }
        public String getAdSoyad() { //Dışarodan geleni okuyabildiğimiz metotumuz, bunlar klasik temel metotlar getter setterlardır.
            return adSoyad;
        }
        public void setAdSoyad(String adSoyad) {//dışarodan geleni yazabildiğimiz metotlarımız, bunlar klasik temel metotlar getter setterlardır.
            this.adSoyad = adSoyad;
        }

        public int getTelefon(){
            return telefon;
        }
        public void setTelefon(int telefon){
            this.telefon = telefon;
        }

        public String getEmail(){
            return email;
        }
        public void setEmail(String email){
            this.email = email;
        }
        public void giris(){
            System.out.println(adSoyad+"Adlı"+"Personel Sisteme Giriş Yapmıştır.");
        }
        //METHOD OVERLOADİNG
        public void giris(String girisSaati){
            System.out.println(adSoyad+" Adlı"+" Personel "+girisSaati+" Saatinde"+" Sisteme Giriş Yapmıştır.");
        }
        public void cikis(){
            System.out.println(adSoyad+"Adlı"+"Personel Sistemden Çıkış Yapmıştır.");
        }
        public void yemekhane(){
            System.out.println(adSoyad+"Adlı"+"Kullanıcı Yemekhane Hakkını Kullanmıştır.");
        }
    }
