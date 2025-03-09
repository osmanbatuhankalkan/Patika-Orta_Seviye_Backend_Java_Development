public class ToolStore extends NormalLoc{

    public ToolStore(Player player) {//Yine burada da name'i paramatre olarak dışarıdan almayacağız.
        //kendimiz buradan sabit bir şekilde vereceğiz.
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("------------------- Mağaza Hoşgeldiniz -------------------");

        boolean showMenu = true;//Bu 'ÇIKIŞ YÖNTEMİ'ni neden kullandık. Çünkü Wile da break komutu sadece kendi içerisinde geçiyor.
        //Biz direk bu methottan çıkmak isteidğimiz için mecbur dışarıda boolean türünde bir değişken yaratıp swichi içinde tersine çevirerek çıktık.
        while (showMenu){
            System.out.println("1- Silahlar");
            System.out.println("2- Zırhlar");
            System.out.println("3- Çıkış");
            int selectCase = Location.input.nextInt();//Location sınıfında bunu static olarak tanımladık.
            // 1 kere üretilsin her nesne için ayrı üretilmesin diye.Üst sınıfı olduğu için bunada geçti.
            System.out.println("Seçiminiz: ");
            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Geçersiz değer, tekrar deneyiniz.");
                selectCase = Location.input.nextInt();
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Bir daha görüşmek üzere... ");
                    showMenu = false;
                     break;
            }
        }
        return true;
    }
    public void printWeapon(){
        System.out.println("----------- Silahlar -----------");
        //Weapon sınıfında ilgili method 'STATİC' olarak tanımlandığı için,
        // yeniden nesne yaratmaya gerek kalmadı.
        for (Weapon w:Weapon.weapons()){
            System.out.println(w.getId() +"-"+
                    w.getName()+
                    " <Para : "+ w.getPrice()+
                    " , Hasar :"+ w.getDamage());
        }
        System.out.println("0- Çıkış Yap");
    }
    public void buyWeapon(){
        System.out.println("Bir Silah Seçiniz : ");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {//dinamik bir şekilde inşa ettik, ileride bir gün silah kategorisi genişlerse esneklik sağlayacak.
            System.out.println("Geçersiz değer, tekrar deneyiniz.");
            selectWeaponID = input.nextInt();
        }
        if(selectWeaponID !=0){
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);

            if(selectedWeapon!=null){
                if (selectedWeapon.getPrice()>this.getPlayer().getMoney()){
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                }else{
                    //Satın almanın gerçekleştiği alan
                    System.out.println(selectedWeapon.getName()+" Silahını Satın Aldınız !");
                    int balance=this.getPlayer().getMoney()- selectedWeapon.getPrice();//oyuncunun parasından, seçmiş olduğu silahın parasını çıkarıyoruz.
                    this.getPlayer().setMoney(balance);//burada da güncellemiş oluyoruz.
                    System.out.println("Kalan Paranız: "+this.getPlayer().getMoney());
                    System.out.println("Önceki Silahınız: "+ this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);// Artık Weapon'um benim artık burada seçtiğim weapon olacak
                    System.out.println("Yeni Silahınız: "+ this.getPlayer().getInventory().getWeapon().getName());

                }
            }
        }

    }
    public void printArmor(){
        System.out.println("----------- Zırhlar -----------");

        for (Armor a : Armor.armors()){
            System.out.println(a.getId() +"-"+
                    a.getName()+
                    " <Para : "+ a.getPrice()+
                    " , Block :"+ a.getBlock()+">");
        }
        System.out.println("0- Çıkış yapmak");
    }
    public void buyArmor(){
        System.out.println("Bir Zırh Seçiniz : ");
        int selectArmorID = input.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {//dinamik bir şekilde inşa ettik, ileride bir gün silah kategorisi genişlerse esneklik sağlayacak.
            System.out.println("Geçersiz değer, tekrar deneyiniz.");
            selectArmorID = input.nextInt();
        }
        if(selectArmorID !=0){

            Armor selectArmor = Armor.getArmorObjByID(selectArmorID);//kullanıcıya seçtirmiş olduğumuz 'Id'yi,
            // Parametre olarak, 'Armor' sınıfındaki, 'getArmorObjByID' methodunun parametresine veriyoruz.
            //Bu method 'Id'ye göre armor objesini döndürüyor.
            // Ve burada da referans değeri olarak 'selectArmor'a veriyoruz.

            if(selectArmor!=null){
                if (selectArmor.getPrice()>this.getPlayer().getMoney()){//Seçilen zırh'ın parası, kullanıcının parasından fazlamı az mı kontrolü yapılır.
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                }else{

                    //Satın almanın gerçekleştiği alan
                    System.out.println(selectArmor.getName()+" Zırhını Satın Aldınız !");
                    int balance=this.getPlayer().getMoney()- selectArmor.getPrice();//oyuncunun parasından, seçmiş olduğu silahın parasını çıkarıyoruz.
                    this.getPlayer().setMoney(balance);//burada da güncellemiş oluyoruz.

                    System.out.println("Kalan Paranız: "+this.getPlayer().getMoney());
                    System.out.println("Önceki Zırhınız: "+ this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectArmor);// Artık Armor'um benim artık burada seçtiğim armor olacak
                    System.out.println("Yeni Zırhınız: "+ this.getPlayer().getInventory().getArmor().getName());

                }
            }
        }
    }
    public void menu(){

    }
    public void buy(){

    }
}
