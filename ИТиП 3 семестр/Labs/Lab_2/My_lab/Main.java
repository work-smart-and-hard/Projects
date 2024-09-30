public class Main {
    public static void main(String[] args) {
        /* Создание объектов с параметрами */
        Cat cat = new Cat("Мурка", 3, "Черный", "Сиамская");
        Parrot parrot = new Parrot("Кеша", 2, "Красный", true);
        Fish fish = new Fish("Немо", 10, "Оранжевый", "Тунец", "Морская");
        /* Вызов абстрактного метода для каждого объекта */
        cat.sound_of_animal();
        System.out.println("----------------");
        parrot.sound_of_animal();
        System.out.println("----------------");
        fish.sound_of_animal();
        System.out.println("----------------");
        System.out.println();
        /* Вызов информации о каждом животном */
        cat.info();
        System.out.println("----------------");
        parrot.info();
        System.out.println("----------------");
        fish.info();
        System.out.println("----------------");
        System.out.println();
        /* Использование переопределенного метода */
        cat.info("Петя");
        System.out.println("----------------");
        parrot.info("Ваня");
        System.out.println("----------------");
        fish.info("Черное море");
        System.out.println("----------------");
        System.out.println();
        /* Создание объекта без указания параметров */
        Fish defaultFish = new Fish();
        defaultFish.sound_of_animal();
        System.out.println("----------------");
        defaultFish.info();
        System.out.println("----------------");
        System.out.println();
        System.out.println("Общее количество животных: " + Animals.getCounter());
    }
}