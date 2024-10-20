import java.util.HashMap;

public class myTask {
    public static void main(String[] args) {
        /* Создание хеш-таблицы */
        HashMap<String, Student> Students = new HashMap<>();
        /* Создание объектов для хеш-таблицы */
        Student student_1 = new Student("Иван", "Иванов", 18, 4.0);
        Student student_2 = new Student("Александр", "Петров", 20, 4.2);
        Student student_3 = new Student("Василий", "Сидоров", 19, 4.9);
        Student student_4 = new Student("Антон", "Пирогов", 21, 4.5);
        Student student_5 = new Student("Артём", "Бобров", 22, 4.8);
        Student student_6 = new Student("Дмитрий", "Воронцов", 23, 4.1);
        Student student_7 = new Student("Олег", "Попов", 24, 4.9);
        Student student_8 = new Student("Игорь", "Громов", 18, 5.0);
        Student student_9 = new Student("Илья", "Сычев", 21, 4.6);
        Student student_10 = new Student();
        /* Вставка студента в хеш-таблицу по номеру зачетки */
        Students.put("1БВТ10324", student_1);
        Students.put("1БВТ11560", student_2);
        Students.put("1БВТ12534", student_3);
        Students.put("1БВТ13879", student_4);
        Students.put("1БВТ14293", student_5);
        Students.put("1БВТ15987", student_6);
        Students.put("1БВТ16892", student_7);
        Students.put("1БВТ17864", student_8);
        Students.put("1БВТ18991", student_9);
        Students.put("1БВТ19038", student_10);
        /* Вывод заполненной хеш-таблицы на экран */
        System.out.println(Students.toString());
        /* Поиск значений студента в хеш-таблице по номеру зачетки */
        System.out.println();
        System.out.println(Students.get("1БВТ14293"));
        System.out.println(Students.get("1БВТ18991"));
        System.out.println(Students.get("1БВТ17864"));
        System.out.println(Students.get("1БВТ15987"));
        System.out.println(Students.get("1БВТ19038"));
        System.out.println(Students.get("1БВТ11111"));
        /* Удаление данных студента из хеш-таблицы по номеру зачетки */
        System.out.println();
        Students.remove("1БВТ10324");
        Students.remove("1БВТ12534");
        Students.remove("1БВТ16892");
        Students.remove("1БВТ11560");
        Students.remove("1БВТ18991");
        Students.remove("1БВТ12345");
        System.out.println(Students.toString());
    }
}