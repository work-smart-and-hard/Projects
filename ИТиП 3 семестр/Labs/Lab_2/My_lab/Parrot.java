public class Parrot extends Animals {
    /* Поля класса */
    private boolean parrot_talk;
    /* Конструктор по умолчанию */
    public Parrot() {
        super();
        this.parrot_talk = false;
    }
    /* Конструктор инициализации */
    public Parrot(String name, int age, String color, boolean parrot_talk) {
        super(name, age, color);
        this.parrot_talk = parrot_talk;
    }
    /* Переопределение абстрактного метода sound_of_animal */
    public void sound_of_animal() {
        if (parrot_talk) {
            System.out.println("Привет! Я хорошая птичка!");
        }
        else {
            System.out.println("...");
        }
    }
    /* Переопределение метода info */
    public void info(String parrot_owner) {
        System.out.println("Хозяина попугая зовут " + parrot_owner + ";");
        super.info();
    }
    /* Возвращение булевого значения, может ли говорить попугай */
    public boolean getParrot_talk() {
        return parrot_talk;
    }
    /* Установка булевого значения, может ли говорить попугай */
    public void setParrot_talk(boolean parrot_talk) {
        this.parrot_talk = parrot_talk;
    }
}