package bulut.com.week3.listclass;

public class MyList<T> {
    private int capacity;
    private T[] list;
    private int size; // Dizideki mevcut eleman sayısı

    // Boş constructor - varsayılan kapasite 10
    @SuppressWarnings("unchecked")
    public MyList() {
        this.capacity = 10;
        this.list = (T[]) new Object[capacity];
        this.size = 0;
    }

    // Kapasiteli constructor
    @SuppressWarnings("unchecked")
    public MyList(int capacity) {
        this.capacity = capacity;
        this.list = (T[]) new Object[capacity];
        this.size = 0;
    }

    // Dizideki eleman sayısını döndürür
    public int size() {
        return this.size;
    }

    // Dizinin kapasitesini döndürür
    public int getCapacity() {
        return this.capacity;
    }

    // Diziye eleman ekler
    @SuppressWarnings("unchecked")
    public void add(T data) {
        // Eğer dizi dolu ise kapasiteyi 2 katına çıkar
        if (size >= capacity) {
            capacity *= 2;
            T[] newList = (T[]) new Object[capacity];

            // Eski diziyi yeni diziye kopyala
            for (int i = 0; i < size; i++) {
                newList[i] = list[i];
            }

            list = newList;
        }

        // Elemanı ekle ve size'ı artır
        list[size] = data;
        size++;
    }

    // Verilen indisteki değeri döndürür
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null; // Geçersiz indis
        }
        return list[index];
    }

    // Verilen indisteki veriyi siler
    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null; // Geçersiz indis
        }

        T removedData = list[index];

        // Silinen indisten sonraki elemanları sola kaydır
        for (int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }

        size--;
        list[size] = null; // Son elemanı null yap

        return removedData;
    }

    // Verilen indisteki veriyi değiştirir
    public T set(int index, T data) {
        if (index < 0 || index >= size) {
            return null; // Geçersiz indis
        }

        T oldData = list[index];
        list[index] = data;
        return oldData;
    }

    // Parametrede verilen nesnenin listedeki indeksini verir
    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (list[i] == null && data == null) {
                return i;
            }
            if (list[i] != null && list[i].equals(data)) {
                return i;
            }
        }
        return -1; // Nesne listede yok
    }

    // Belirtilen öğenin listedeki son indeksini söyler
    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (list[i] == null && data == null) {
                return i;
            }
            if (list[i] != null && list[i].equals(data)) {
                return i;
            }
        }
        return -1; // Nesne listede yok
    }

    // Listenin boş olup olmadığını söyler
    public boolean isEmpty() {
        return size == 0;
    }

    // Listedeki öğeleri aynı sırayla bir array haline getirir
    public Object[] toArray() {
        Object[] array = new Object[size];
        for (int i = 0; i < size; i++) {
            array[i] = list[i];
        }
        return array;
    }

    // Tip güvenli array döndüren alternatif metod
    @SuppressWarnings("unchecked")
    public T[] toArray(T[] a) {
        if (a.length < size) {
            // Yeni array oluştur
            return (T[]) java.util.Arrays.copyOf(list, size, a.getClass());
        }
        System.arraycopy(list, 0, a, 0, size);
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }

    // Listedeki bütün öğeleri siler, boş liste haline getirir
    public void clear() {
        for (int i = 0; i < size; i++) {
            list[i] = null;
        }
        size = 0;
    }

    // Parametrede verilen indeks aralığına ait bir liste döner
    public MyList<T> sublist(int start, int finish) {
        // Geçersiz indeks kontrolü
        if (start < 0 || finish >= size || start > finish) {
            return new MyList<>(); // Boş liste döndür
        }

        MyList<T> subList = new MyList<>();
        for (int i = start; i <= finish; i++) {
            subList.add(list[i]);
        }
        return subList;
    }

    // Parametrede verilen değerin dizide olup olmadığını söyler
    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

    // Dizideki elemanları string olarak döndürür
    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < size; i++) {
            sb.append(list[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}