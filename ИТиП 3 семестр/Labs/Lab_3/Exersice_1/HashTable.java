import java.util.LinkedList; 

public class HashTable<K, V> {
    /* Поля класса */
    private LinkedList<Entry<K, V>>[] table;
    private static int size = 0;
    /* Реализация метода size() */
    public int size() {
        return size;
    }
    /* Реализация метода isEmpty() */
    public boolean isEmpty() {
        return size == 0;
    }
    /* Конструктор класса HashTable по умолчанию */
    public HashTable() {
        this(16384);
    }
    /* Конструктор инициализации */
    @SuppressWarnings("unchecked")
    public HashTable(int _tableSize) {
        table = (LinkedList<Entry<K, V>>[]) new LinkedList[_tableSize];
    }
    /* Класс Entry<K, V> */
    @SuppressWarnings("hiding") 
    private class Entry<K, V> {
        /* Поля класса */
        public K key;
        public V value;
        /* Конструктор по умолчанию */
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
        /* Метод для возвращения ключа */
        public K getKey() {
            return key;
        }
        /* Метод для установки значения */
        public void setValue(V value) {
            this.value = value;
        }
    }
    /* Реализация метода преобразования хеш-кода по ключу в индекс массива table */
    private int hash(K key) {
        return Math.abs(key.hashCode()) % table.length;
    }
    /* Реализация метода добавления пары "ключ=значение" в таблицу */
    public void put(K key, V value) { 
        int index = hash(key); 
        if (table[index] == null) { 
            table[index] = new LinkedList<>();
        } 
        for (Entry<K, V> entry : table[index]) { 
            if (entry.getKey().equals(key)) { 
                entry.setValue(value); 
                return; 
            } 
        } 
        table[index].add(new Entry<K, V>(key, value)); 
            size++; 
    }
    /* Реализация метода возврата значения из таблицы по ключу */
    public V get(K key) {
        int index = hash(key);
        if (table[index] == null) {
            return null;
        }
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                return entry.value;
            }
        }
        return null;
    }
    /* Реализация метода удаления значения из таблицы по ключу */
    public void remove(K key) {
        if (get(key) == null) {
            return;
        }
        int index = hash(key);
        for (Entry<K, V> entry : table[index]) {
            if (entry.getKey().equals(key)) {
                table[index].remove(entry);
                size--;
            }
        }
        if (table[index].isEmpty()) {
            table[index] = null;
        }
    }
}