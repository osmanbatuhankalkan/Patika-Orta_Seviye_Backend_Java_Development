public class Student implements IDatabase<Student>{
    /// Biz burada generic içerisine 'Student' attığımız için
/// Aşşağıdaki CRUD işlemlerinde parametre olarak Hep 'Student' var. Eğer 'String' vs. olasydı hepsini o şekilde düzenleyecektim.

    @Override
    public boolean insert(Student data) {
        System.out.println(data);
        System.out.println("'Student Sınıfı': Veri Eklendi.");
        return true;
    }

    @Override
    public boolean delete(Student data) {
        System.out.println("'Student Sınıfı': Veri Silindi");
        return true;
    }

    @Override
    public boolean update(Student data) {
        System.out.println("'Student Sınıfı': Veri Güncellendi.");
        return true;
    }

    //@Override
    public Student select() {
        System.out.println("'Student Sınıfı': Veri Çekildi");
        return null;
    }
}
