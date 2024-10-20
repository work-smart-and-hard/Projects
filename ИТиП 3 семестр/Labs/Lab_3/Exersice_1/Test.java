public class Test {
    public static void main(String[] args) {
        HashTable<Integer, String> Players = new HashTable<>();
        /* Проверка работы метода put(K key, V value) */
        Players.put(23, "Michael Jordan");
        Players.put(24, "Kobe Bryant");
        Players.put(34, "Shakil O'nil");
        Players.put(33, "Larry Bird");
        Players.put(44, "Jerry West");
        /* Проверка работы метода size() */
        System.out.println(Players.size());
        /* Проверка работы метода get(K key) */
        System.out.println(Players.get(34));
        System.out.println(Players.get(24));
        System.out.println(Players.get(44));
        /* Проверка работы метода remove(K key) */
        Players.remove(33);
        Players.remove(44);
        /* Проверка работы метода size() */
        System.out.println(Players.size());
        /* Проверка работы метода isEmpty() */
        System.out.println(Players.isEmpty());
    }
}