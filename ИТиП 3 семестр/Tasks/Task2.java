import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Решение задания 1");
        System.out.println("Для строк 'Barack' и 'Obama' результатом будет: " + duplicateChars("Barack", "Obama"));
        System.out.println();
        System.out.println("Решение задания 2");
        int[] list_of_numbers = {3, 12, 7, 81, 52};
        System.out.println("Для массива [3, 12, 7, 81, 52] результатом является число: " + dividedByThree(list_of_numbers));
        System.out.println();
        System.out.println("Решение задания 3");
        System.out.println("Для строки 'simonov sergei evgenievich' результат: " + getInitials("simonov sergei evgenievich"));
        System.out.println("Для строки 'kozhevnikova tatiana vitalevna' результат: " + getInitials("kozhevnikova tatiana vitalevna"));
        System.out.println();
        System.out.println("Задание 4");
        double[] list_1 = {3.5, 7.0, 1.5, 9.0, 5.5};
        double[] list_2 = {10.0, 10.0, 10.0, 10.0};
        double[] result_1 = normalizator(list_1);
        double[] result_2 = normalizator(list_2);
        System.out.println("Для массива данных [3.5, 7.0, 1.5, 9.0, 5.5] результат: " + Arrays.toString(result_1));
        System.out.println("Для массива данных [10.0, 10.0, 10.0, 10.0] результат: " + Arrays.toString(result_2));
        System.out.println();
        System.out.println("Задание 5");
        double[] num_list = {1.6, 0, 212.3, 34.8, 0, 27.5};
        int[] result_list = compressedNums(num_list);
        System.out.println("Для массива данных [1.6, 0, 212.3, 34.8, 0, 27.5] результат: " + Arrays.toString(result_list));
        System.out.println();
        System.out.println("Задание 6");
        String str = "helloWorld";
        System.out.println("Для строки " + str + " результат: " + camelToSnake(str));
        System.out.println();
        System.out.println("Задание 7");
        int[] list_of_int_numbers = {3, 5, 8, 1, 2, 4};
        System.out.println("Для массива данных [3, 5, 8, 1, 2, 4] результат: " + secondBiggest(list_of_int_numbers));
        System.out.println();
        System.out.println("Задание 8");
        System.out.println("Для строки 'baobab' результат: " + localReverse("baobab", 'b'));
        System.out.println("Для строки 'Hello, I'm under the water, please help me' результат: " 
        + localReverse("Hello, I'm under the water, please help me", 'e'));
        System.out.println();
        System.out.println("Задание 9");
        int[] numbers_1 = {8, 1, 8};
        int[] numbers_2 = {5, 5, 5};
        int[] numbers_3 = {4, 9, 6};
        System.out.println("Для массива данных [8, 1, 8] результат: " + equal(numbers_1));
        System.out.println("Для массива данных [5, 5, 5] результат: " + equal(numbers_2));
        System.out.println("Для массива данных [4, 9, 6] результат: " + equal(numbers_3));
        System.out.println();
        System.out.println("Задание 10");
        String str_1 = "LISTEN";
        String str_2 = "silent";
        String str_3 = "Eleven plus two?";
        String str_4 = "Twelve plus one!";
        String str_5 = "hello";
        String str_6 = "world";
        System.out.println("Результат для строк 'LISTEN' и 'silent' - " + isAnagram(str_1, str_2));
        System.out.println("Результат для строк 'Eleven plus two?' и 'Twelve plus one!' - " + isAnagram(str_3, str_4));
        System.out.println("Результат для строк 'hello' и 'world' - " + isAnagram(str_5, str_6));
    }
    /* Метод для задания 1 */
    public static String duplicateChars(String str_1, String str_2) {
        String filter_string = "["+ str_2.toLowerCase() +"]";
        return str_1.toLowerCase().replaceAll(filter_string, "");
    }
    /* Метод для задания 2 */
    public static int dividedByThree(int[] list) {
        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            if ((list[i] % 2 != 0) && (list[i] % 3 == 0)) {
                counter += 1;
            }
        }
        return counter;
    }
    /* Метод для задания 3 */
    public static String getInitials(String str) {
        String res_str = "";
        String[] split_str = str.split(" ");
        res_str = split_str[1].substring(0, 1).toUpperCase() + "." + split_str[2].substring(0, 1).toUpperCase() + "." 
        + split_str[0].substring(0, 1).toUpperCase() + split_str[0].substring(1);
        return res_str;
    }
    /* Метод для задания 4 */
    public static double[] normalizator(double[] list) {
        double[] list_clone = list.clone();
        Arrays.sort(list_clone);
        double max_number = list_clone[list_clone.length - 1];
        double min_number = list_clone[0];
        double[] new_list = new double[list.length];
        for (int k = 0; k < list.length; k++) {
            double x = list[k];
            double x_ = (x - min_number) / (max_number - min_number);
            if (max_number == min_number) {
                x_ = 0.0;
            }
            new_list[k] = Math.round(x_ * 10000.0) / 10000.0;
        }
        return new_list;
    }
    /* Метод для задания 5 */
    public static int[] compressedNums(double[] numbers_list) {
        int zero_counter = 0;
        for (int k = 0; k < numbers_list.length; k++) {
            double item = numbers_list[k];
            if (item == 0.0) {
                zero_counter += 1;
            }
        }
        Arrays.sort(numbers_list);
        int[] numbers = new int[numbers_list.length - zero_counter];
        for (int i = 0; i < numbers_list.length; i++) {
            int int_item = (int) numbers_list[i];
            if (int_item != 0) {
                numbers[i - zero_counter] = int_item;
            }
        }
        Arrays.sort(numbers);
        return numbers;
    }
    /* Метод для задания 6 */
    public static String camelToSnake(String str) {
        String[] split_str = str.split("");
        int index_of_capital_letter = -1;
        for (int j = 0; j < split_str.length; j++) {
            index_of_capital_letter += 1;
            String current_symbol = split_str[j];
            if (current_symbol.equals(current_symbol.toUpperCase())) {
                break;
            }
        }
        String new_str = str.substring(0, index_of_capital_letter) + "_" + str.substring(index_of_capital_letter).toLowerCase();
        return new_str;
    }
    /* Метод для задания 7 */
    public static int secondBiggest(int[] list) {
        Arrays.sort(list);
        int second_biggest = list[list.length - 2];
        return second_biggest;
    }
    /* Методы для задания 8 */
    public static String reverseString(String s) {
        String str = "";
        for (int j = s.length() - 1; j >= 0; j--) {
            str += s.charAt(j);
        }
        return str;
    }
    public static String localReverse(String s, char symbol) {
        StringBuilder s_Builder = new StringBuilder(s);
        boolean flag = false;
        int index_of_symbol = 0;
        String s_between_symbols = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != symbol) {
                continue;
            }
            flag = !flag;
            if (flag) {
                index_of_symbol = i + 1;
            }
            else {
                s_between_symbols = s.substring(index_of_symbol, i);
                s_Builder.replace(index_of_symbol, i, reverseString(s_between_symbols));
            }
        }
        return s_Builder.toString();
    }
    /* Метод для задания 9 */
    public static int equal(int[] list_numbers) {
        int a = list_numbers[0];
        int b = list_numbers[1];
        int c = list_numbers[2];
        int equal_numbers = 0;
        if ((a == b) || (b == c) || (a == c)) {
            equal_numbers = 2;
        }
        if ((a == b) && (b == c) && (a == c)) {
            equal_numbers = 3;
        }
        return equal_numbers;
    }
    /* Метод для задания 10 */
    public static boolean isAnagram(String string_1, String string_2) {
        String filter_ = "[!@#$%^&*?]";
        char[] list_1 = string_1.toLowerCase().replaceAll(filter_, "").toCharArray();
        char[] list_2 = string_2.toLowerCase().replaceAll(filter_, "").toCharArray();
        Arrays.sort(list_1);
        Arrays.sort(list_2);
        if (Arrays.equals(list_1, list_2)) {
            return true;
        }
        return false;
    }
}