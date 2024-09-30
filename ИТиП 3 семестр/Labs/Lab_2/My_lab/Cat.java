public class Cat extends Animals {
    /* Поля класса */
    private String animal_breed;
    /* Конструктор по умолчанию */
    public Cat() {
        super();
        this.animal_breed = "Неизвестна";
    }
    /* Конструктор инициализации */
    public Cat(String name, int age, String color, String animal_breed) {
        super(name, age, color);
        this.animal_breed = animal_breed;
    }
    /* Переопределение абстрактного метода sound_of_animal */
    public void sound_of_animal() {
        System.out.println("Мяу!");
    }
    /* Переопределение метода info */
    public void info(String cat_owner) {
        System.out.println("Хозяин кошки - " + cat_owner + ";");
        super.info();
    }
    /* Возвращение породы кошки */
    public String getCatBreed() {
        return animal_breed;
    }
    /* Установка породы кошки */
    public void setCatBreed(String animal_breed) {
        this.animal_breed = animal_breed;
    }
}