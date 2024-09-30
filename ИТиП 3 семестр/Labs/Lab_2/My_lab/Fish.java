public class Fish extends Cat {
    /* Поля класса */
    private String type_of_water;
    /* Конструктор по умолчанию */
    public Fish() {
        super();
        this.type_of_water = "Речная";
    }
    /* Конструктор инициализации */
    public Fish(String name, int age, String color, String animal_breed, String type_of_water) {
        super(name, age, color, animal_breed);
        this.type_of_water = type_of_water;
    }
    /* Переопределение абстрактного метода sound_of_animal */
    public void sound_of_animal() {
        System.out.println("...");
    }
    /* Переопределение метода info */
    public void info(String fish_place) {
        System.out.println("Эта рыба обитает в месте, название которого: " + fish_place + ";");
        super.info();
    }
    /* Возвращение типа воды, в котором живет рыба */
    public String getTypeOfWater() {
        return type_of_water;
    }
    /* Установка типа воды, в котором живет рыба */
    public void setCanTalk(String type_of_water) {
        this.type_of_water = type_of_water;
    }
}