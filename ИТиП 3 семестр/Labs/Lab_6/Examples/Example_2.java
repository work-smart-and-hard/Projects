import java.util.ArrayList;
import java.util.List;

public class Example_2 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        List<Integer> numbers = new ArrayList<>();
    }
    // Использование дженериков в методе 
    public static <T> T getFirst(List<T> list) {
        return list.get(0);
    }
    // Использование дженериков в интерфейсе
    public interface Pair<K, V> {
        K getKey();
        V getValue();
    }
}