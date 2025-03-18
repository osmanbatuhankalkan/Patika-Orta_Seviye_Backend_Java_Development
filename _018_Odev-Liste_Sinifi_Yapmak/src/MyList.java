public class MyList<T> {
    private int capacity;
    private T[] array;
    private int size;

    // Varsayılan kapasite 10
    @SuppressWarnings("unchecked")
    public MyList() {
        this.capacity = 10;
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }

    // Kullanıcının belirlediği kapasiteyle başlatma
    @SuppressWarnings("unchecked")
    public MyList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }

    // Eleman ekleme işlemi
    public void add(T data) {
        if (size >= capacity) {
            expandCapacity(); // Kapasiteyi artır
        }
        array[size++] = data; // Yeni elemanı ekle
    }

    // Kapasiteyi 2 katına çıkarma
    @SuppressWarnings("unchecked")
    private void expandCapacity() {
        capacity *= 2;
        T[] newArray = (T[]) new Object[capacity];

        // Eski elemanları yeni diziye kopyala
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }

        array = newArray; // Yeni diziyi atama
    }

    // Eleman sayısını döndüren metod
    public int size() {
        return size;
    }

    // Kapasiteyi döndüren metod
    public int getCapacity() {
        return capacity;
    }

    // Belirtilen index'teki elemanı döndürme
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null; // Geçersiz index
        }
        return array[index];
    }

    // Belirtilen index'teki elemanı güncelleme
    public void set(int index, T data) {
        if (index < 0 || index >= size) {
            return; // Geçersiz index
        }
        array[index] = data;
    }

    // Belirtilen index'teki elemanı kaldırma
    public void remove(int index) {
        if (index < 0 || index >= size) {
            return; // Geçersiz index
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[size - 1] = null; // Son elemanı temizle
        size--; // Eleman sayısını azalt
    }

    // Listenin içeriğini döndüren metod
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            str.append(array[i]);
            if (i < size - 1) {
                str.append(", ");
            }
        }
        str.append("]");
        return str.toString();
    }

    // Verilen elemanın index'ini bulma (ilk görülen)
    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1; // Bulunamazsa -1 döndür
    }

    // Verilen elemanın son index'ini bulma
    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    // Listenin boş olup olmadığını kontrol etme
    public boolean isEmpty() {
        return size == 0;
    }

    // Listeyi diziye çevirme
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    // Verilen aralıktaki elemanları içeren yeni bir liste oluşturma
    public MyList<T> subList(int start, int finish) {
        if (start < 0 || finish >= size || start > finish) {
            return null; // Geçersiz aralık
        }
        MyList<T> subList = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            subList.add(array[i]);
        }
        return subList;
    }

    // Elemanın listede olup olmadığını kontrol etme
    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

    // Listeyi tamamen temizleme
    @SuppressWarnings("unchecked")
    public void clear() {
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }
}
