public class Main {
    public static void main(String[] args) {
        /// Student Sınıfı
        System.out.println("'Student Sınıfı': Sabit Tür.");
        IDatabase<Student> studentDb = new Student();
        Student student1 = new Student();

        studentDb.insert(student1);
        studentDb.update(student1);
        studentDb.delete(student1);
        studentDb.select();

        System.out.println("############################################");

        ///GenericStudent Sınıfı
        System.out.println("\n*** Generic Student Sınıfı: Esnek Tür.");
        IDatabase<String> stringDb = new GenericStudent<>();
        stringDb.insert("Merhaba, dünya!");
        stringDb.update("Güncellenmiş metin");
        stringDb.delete("Silinecek metin");
        stringDb.select();

        System.out.println("\n*** Generic Student Sınıfı: Integer Kullanımı.");
        IDatabase<Integer> intDb = new GenericStudent<>();
        intDb.insert(42);
        intDb.update(84);
        intDb.delete(42);
        intDb.select();
    }
}
