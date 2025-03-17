public class GenericStudent<T> implements IDatabase<T>{
    @Override
    public boolean insert(T data) {
        System.out.println(data);
        System.out.println("'*Generic Student Sınıfı': Veri Eklendi.");
        return true;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("'*Generic Student Sınıfı': Veri Silindi");
        return true;
    }

    @Override
    public boolean update(T data) {
        System.out.println("'*Generic Student Sınıfı': Veri Güncellendi.");
        return true;
    }

    @Override
    public T select() {
        System.out.println("'*Generic Student Sınıfı': Veri Çekildi");
        return null;
    }
}
