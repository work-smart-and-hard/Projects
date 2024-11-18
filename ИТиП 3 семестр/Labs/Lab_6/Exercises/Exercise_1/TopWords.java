import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;

public class TopWords {
    public static void main(String[] args) {
        // указываем путь к файлу
        String filePath = "C:/Users/Worker/Projects/ИТиП 3 семестр/Labs/Lab_6/Exercises/Exercise_1/Kobe_Bryant_speech.txt";
        // создаем объект File
        File file = new File(filePath);
        // создаем объект Scanner для чтения файла
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // создаем объект Map для хранения слов и их количества
        Map<String, Integer> top_words = new HashMap<>();
        // читаем файл по словам и добавляем их в Map
        scanner.useDelimiter("\\s"); // разделение слов в файле по пробелу
        while (scanner.hasNext()) {
            String word = scanner.next().replaceAll("[^A-Za-z']", "").toLowerCase();
            if (word.isBlank()) {
                continue;
            }
            top_words.putIfAbsent(word, 0);
            top_words.put(word, top_words.get(word) + 1);
        }
        // создаем список из элементов Map
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(top_words.entrySet());
        // сортируем список по убыванию количества повторений
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        // выводим результат
        for (int k = 0; k < 10; k++) {
            System.out.println(String.valueOf(k + 1) + " место: " + list.get(k).getKey());
        }
    }
}