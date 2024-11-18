import java.util.List;
import java.util.ArrayList;

public class selledGoods {
    public static void main(String[] args) {
        // создание списка ArrayList, который будет отображать проданные товары
        List<String> list = new ArrayList<>();
        // заполнение списка
        list.add("Тормозные колодки");
        list.add("Амортизаторы");
        list.add("Свеча зажигания");
        list.add("Глушитель");
        list.add("Масляный фильтр");
        list.add("Воздушный фильтр");
        list.add("Аккумуляторы");
        list.add("Двигатель");
        list.add("Ремень ГРМ");
        list.add("Коробка передач");
        System.out.println("Список проданных товаров: " + list);
    }
}