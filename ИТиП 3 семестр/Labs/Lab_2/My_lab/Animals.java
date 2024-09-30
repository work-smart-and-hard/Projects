public abstract class Animals {
    /* Поля абстрактного класса */
    private String name;
    private int age;
    private String color;
    /* Счетчик созданных объектов всех наследуемых классов */
    private static int counter = 0;
    /* Конструктор по умолчанию */
    public Animals() {
        this.name = "Неизвестно";
        this.age = 0;
        this.color = "Неизвестен";
        counter += 1;
    }
    /* Конструктор инициализации */
    public Animals(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        counter += 1;
    }
    /* Абстрактный метод, реализующийся в наследуемых классах */
    public abstract void sound_of_animal();
    /* Метод получения информации об объекте */ 
    public void info() {
        System.out.println("Имя: " + name + ";");
        System.out.println("Возраст в годах: " + age + ";");
        System.out.println("Цвет: " + color + ";");
    }
    /* Возвращение имени животного */
    public String getName() {
        return name;
    }
    /* Возвращение возраста животного */
    public int getAge() {
        return age;
    }
    /* Возвращение цвета животного */
    public String getColor() {
        return color;
    }
    /* Возвращение количества созданных объектов */
    public static int getCounter() {
        return counter;
    }
    /* Установка имени животного */
    public void setName(String name) {
        this.name = name;
    }
    /* Установка возраста животного */
    public void setAge(int age) {
        this.age = age;
    }
    /* Установка цвета животного */
    public void setColor(String color) {
        this.color = color;
    }
}