public class Student {
    /* Поля класса */
    private String name;
    private String surname;
    private int age;
    private double mean_score;
    /* Конструктор по умолчанию */
    public Student() {
        this.name = "Василий";
        this.surname = "Пупкин";
        this.age = 17;
        this.mean_score = 4.0;
    }
    /* Конструктор с параметрами */
    public Student(String name, String surname, int age, double mean_score) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mean_score = mean_score;
    }
    @Override
    public String toString() {
        return "{" + name + ", " + surname + ", " + age + ", " + mean_score + "}";
    }
}