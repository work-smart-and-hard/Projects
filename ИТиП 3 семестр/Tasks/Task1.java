public class Task1 {
    public static void main(String[] args) {
        System.out.println("Решение задания 1");
        double[] liter_values = {5, 3, 8};
        for (int j = 0; j < liter_values.length; j++) {
            double result_in_liters = liter_values[j];
            double result_in_galoons = convert(result_in_liters);
            System.out.println("Значение в литрах: " + result_in_liters + "; Значение в галлонах: " + result_in_galoons + ";");
        }
        System.out.println();
        System.out.println("Решение задания 2");
        int[] intensity_mode = {1, 2, 3};
        int[] training_time = {15, 24, 41};
        for (int i = 0; i < 3; i++) {
            int current_intensity = intensity_mode[i];
            int current_minutes = training_time[i];
            int spent_calories = fitCalc(current_intensity, current_minutes);
            System.out.println("При режиме интенсивности " + current_intensity + " и времени тренировки " + current_minutes 
            + " минут затраченные калории: " + spent_calories + ";");
        }
        System.out.println();
        System.out.println("Решение задания 3");
        int[] boxes = {3, 5, 4};
        int[] bags = {4, 0, 1};
        int[] barrels = {2, 2, 4};
        for (int k = 0; k < 3; k++) {
            int current_boxes = boxes[k];
            int current_bags = bags[k];
            int current_barrels = barrels[k];
            int total_commodities = containers(current_boxes, current_bags, current_barrels);
            System.out.println("При количестве " + current_boxes + " коробок, " + current_bags + " мешков, " + current_barrels 
            + " бочек количество товаров равно " + total_commodities + ";");
        }
        System.out.println();
        System.out.println("Решение задания 4");
        int[] side_a = {5, 5, 3, 5};
        int[] side_b = {5, 4, 4, 1};
        int[] side_c = {5, 5, 5, 1};
        for (int i = 0; i < 4; i++) {
            int current_side_a = side_a[i];
            int current_side_b = side_b[i];
            int current_side_c = side_c[i];
            String triangle_type_result = triangleType(current_side_a, current_side_b, current_side_c);
            System.out.println("Треугольник со сторонами " + current_side_a + ", " + current_side_b + ", " + current_side_c 
            + " - " + triangle_type_result);
        }
        System.out.println();
        System.out.println("Решение задания 5");
        int[] input_a = {8, 1, 5};
        int[] input_b = {4, 11, 9};
        for (int j = 0; j < 3; j++) {
            int current_a = input_a[j];
            int current_b = input_b[j];
            int result = ternaryEvaluation(current_a, current_b);
            System.out.println("Для чисел " + current_a + " и " + current_b + " результатом является число " + result);
        }
        System.out.println();
        System.out.println("Решение задания 6");
        double[] length = {22, 45, 100};
        double[] height = {1.4, 1.8, 2};
        double[] width = {2, 1.9, 2};
        for (int k = 0; k < 3; k++) {
            double current_length = length[k];
            double current_height = height[k];
            double current_width = width[k];
            int quantity = howManyItems(current_length, current_height, current_width);
            System.out.println("Для рулона длиной " + current_length + ", высотой " + current_height
            + " и шириной " + current_width + " количество сшитых пододеяльников равно " + quantity + ";");
        }
        System.out.println();
        System.out.println("Решение задания 7");
        int[] numbers = {3, 5, 7};
        for (int i = 0; i < 3; i++) {
            int current_number = numbers[i];
            int factorial_of_number = factorial(current_number);
            System.out.println("Факториал числа " + current_number + " равен " + factorial_of_number);
        }
        System.out.println();
        System.out.println("Решение задания 8");
        int[] number_1 = {48, 52, 259};
        int[] number_2 = {18, 8, 28};
        for (int j = 0; j < 3; j++) {
            int current_number_1 = number_1[j];
            int current_number_2 = number_2[j];
            int greatest_common_divisor = gcd(current_number_1, current_number_2);
            System.out.println("Наибольший общий делитель для чисел " + current_number_1 + " и " + current_number_2 + " -  это " 
            + greatest_common_divisor + ";");
        }
        System.out.println();
        System.out.println("Решение задания 9");
        int[] number_of_tickets = {70, 24, 53};
        int[] price_of_tickets = {1500, 950, 1250};
        for (int i = 0; i < 3; i++) {
            int current_number_of_tickets = number_of_tickets[i];
            int current_price_of_tickets = price_of_tickets[i];
            int ticket_revenue = ticketSaler(current_number_of_tickets, current_price_of_tickets);
            System.out.println("Выручка за " + current_number_of_tickets + " билетов по цене " + current_price_of_tickets 
            + " составила " + ticket_revenue + ";");
        }
        System.out.println();
        System.out.println("Решение задания 10");
        int[] students = {5, 31, 123};
        int[] desks = {2, 20, 58};
        for (int k = 0; k < 3; k++) {
            int current_number_of_students = students[k];
            int current_number_of_desks = desks[k];
            int desks_needed = tables(current_number_of_students, current_number_of_desks);
            System.out.println("Для " + current_number_of_students + " студентов предоставили " + current_number_of_desks 
            + " парт, количество столов, которых не хватает для размещения всех студентов - " + desks_needed + ";");
        }
    }
    /* Метод для задания 1 */
    public static double convert(double number) {
        return (number * 3.78541);
    }
    /* Метод для задания 2 */
    public static int fitCalc(int intensity, int minutes) {
        return (intensity * minutes);
    }
    /* Метод для задания 3 */
    public static int containers(int boxes_number, int bags_number, int barrels_number) {
        return (boxes_number * 20 + bags_number * 50 + barrels_number * 100);
    }
    /* Метод для задания 4 */
    public static String triangleType(int x, int y, int z) {
        double max_side = Math.max(x, Math.max(y, z));
        String type = "";
        if (max_side < (x + y + z - max_side)) {
            if ((x == y) || (x == z) || (y == z)) {
                type = "isosceles";
            }
            if ((x == y) && (x == z) && (y == z)) {
                type = "equilaterial";
            }
            if ((x != y) && (x != z) && (y != z)) {
                type = "different-sided";
            }
        }
        else {
            type = "is not a triangle";
        }
        return type;
    }
    /* Метод для задания 5 */
    public static int ternaryEvaluation(int a, int b) {
        return (a > b) ? a : b;
    }
    /* Метод для задания 6 */
    public static int howManyItems(double length, double height, double width) {
        return (int) Math.floor((length * 2.0) / (height * width));
    }
    /* Метод для задания 7 */
    public static int factorial(int n) {
        int result = 1;
        for (int k = 2; k <= n; k++) {
            result *= k;
        }
        return result;
    }
    /* Метод для задания 8 */
    public static int gcd(int number_1, int number_2) {
        int max_number = Math.max(number_1, number_2);
        int min_number = Math.min(number_1, number_2);
        int remainder = max_number % min_number;
        while (remainder > 0) {
            max_number = min_number;
            min_number = remainder;
            remainder = max_number % min_number;
        }
        return min_number;
    }
    /* Метод для задания 9 */
    public static int ticketSaler(int saled_tickets, int price) {
        double commission = 0.28;
        return (int) (saled_tickets * price * (1.0 - commission));
    }
    /* Метод для задания 10 */
    public static int tables(int students, int tables) {
        int students_without_desks = students - tables * 2;
        if (students_without_desks < 0) {
            return 0;
        }
        else {
            return students_without_desks / 2 + students_without_desks % 2;
        }
    }
}