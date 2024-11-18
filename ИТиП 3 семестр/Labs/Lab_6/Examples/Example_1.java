import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example_1 {
    public static void main(String[] args) {
        // Создание списка и добавление элементов 
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        // Использование цикла для обхода элементов списка
        for (String fruit : list) {
            System.out.println(fruit);
        }
        // Удаление элементов из списка
        list.remove("banana");
        System.out.println(list);
        // Использование итератора для обхода элементов списка
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
        // Удаление элемента из списка с помощью итератора
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("banana")) {
                iterator.remove();
            }
        }
    }
}