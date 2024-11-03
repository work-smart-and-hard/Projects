import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Решение задания 1");
        System.out.println("Для строки 'abracadabra' результат: " + nonRepeat("abracadabra"));
        System.out.println("Для строки 'abababcac' результат: " + nonRepeat("abababcac"));
        System.out.println();
        System.out.println("Решение задания 2");
        System.out.println("Для слов длины 1 и алфавита размером 5 результатом является: " + bruteForce(1, 5));
        System.out.println("Для слов длины 2 и алфавита размером 2 результатом является: " + bruteForce(2, 2));
        System.out.println("Для слов длины 5 и алфавита размером 3 результатом является: " + bruteForce(5, 3));
        System.out.println();
        System.out.println("Решение задания 3");
        int[] numbers = {0, 31, 28, 10, 29};
        System.out.println("Для строк 'MTUCI' и 'MKIIT' результатом шифровки является: " + encode("MTUCI", "MKIIT"));
        System.out.println("Для чисел [0, 31, 28, 10, 29] и строки 'MKIIT' результат: " + decode(numbers, "MKIIT"));
        System.out.println();
        System.out.println("Решение задания 4");
        System.out.println("Для строки '()()()' результат: " + split("()()()"));
        System.out.println("Для строки '((()))' результат: " + split("((()))"));
        System.out.println("Для строки '((()))(())()()(()())' результат: " + split("((()))(())()()(()())"));
        System.out.println("Для строки '((())())(()(()()))' результат: " + split("((())())(()(()()))"));
        System.out.println();
        System.out.println("Решение задания 5");
        System.out.println("Для строки 'abbccc' результат: " + shortHand("abbccc"));
        System.out.println("Для строки 'vvvvaajaaaaa' результат: " + shortHand("vvvvaajaaaaa"));   
        System.out.println();
        System.out.println("Решение задания 6");
        System.out.println("Для числа 8 результат: " + toRoman(8));
        System.out.println("Для числа 1234 результат: " + toRoman(1234));
        System.out.println("Для числа 52 результат: " + toRoman(52));
        System.out.println();
        System.out.println("Решение задания 7");
        System.out.println("Для строки '31312131' результат: " + uniqueSubstring("31312131"));
        System.out.println("Для строки '1111111' результат: " + uniqueSubstring("1111111"));
        System.out.println("Для строки '12223234333' результат: " + uniqueSubstring("12223234333"));
        System.out.println();
        System.out.println("Решение задания 8");
        System.out.println("Для примера 1 результат: " 
        + Arrays.toString(labyrinth(new int[][] {{ 1, 3, 1}, { 1,-1, 1}, { 4, 2, 1}})));
		System.out.println("Для примера 2 результат: " 
        + Arrays.toString(labyrinth(new int[][] {{ 2,-7, 3}, {-4,-1, 8}, { 4, 5, 9}})));
        System.out.println("Решение задания 9");
        System.out.println("Для строки 't3o the5m 1One all6 r4ule ri2ng' результат: " 
        + numericOrder("t3o the5m 1One all6 r4ule ri2ng"));
        System.out.println("Для строки 're6sponsibility Wit1h gr5eat power3 4comes g2reat' результат: " 
        + numericOrder("re6sponsibility Wit1h gr5eat power3 4comes g2reat"));
        System.out.println();
        System.out.println("Решение задания 10");
        System.out.println("Для строки 'CCCABDD' результат: " + fibString("CCCABDD"));
        System.out.println("Для строки 'ABC' результат: " + fibString("ABC"));
    }
    /* Метод для задания 1 */
    public static String nonRepeat(String str) {
        String str_copy = str;
        for (int i = 0; i < str.length(); i++) {
            String current_symbol = "[" + str.substring(i, i + 1) + "]";
            str = str_copy.replaceAll(current_symbol, "");
            if (str_copy.length() < str.length() - 3) {
                return nonRepeat(str_copy);
            }
        }
        return str;
    }
    /* Метод для задания 2 */
    public static ArrayList<String> bruteForce(int n, int k) {
        ArrayList<String> list = new ArrayList<>();
        if (n == 1 && n <= k) {
            for (int i = 0; i < k; i++) {
                String word = String.valueOf(i);
                list.add(word);    
            }
        }
        if (n == 2 && n <= k) {
            StringBuilder alphabet = new StringBuilder();
            for (int a = 0; a < k; a++) {
                alphabet.append(a);
            }
            for (int j = 0; j < k; j++) {
                for (int alph = 0; alph < k; alph++) {
                    if (j == alph) {
                        continue;
                    }
                    String word = String.valueOf(j) + alphabet.substring(alph, alph + 1);
                        list.add(word);
                }
            }
        }
        return list;
    }
    /* Методы для задания 3 */
    public static ArrayList<Integer> encode(String str_1, String str_2) {
        ArrayList<Integer> numbers_ = new ArrayList<>();
        for (int j = 0; j < str_1.length(); j++) {
            numbers_.add((int) (str_1.charAt(j) ^ str_2.charAt(j)));
        }
        return numbers_;
    }

    public static String decode(int[] nums, String str) {
        StringBuilder new_str = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            new_str.append((char) (str.charAt(i) ^ nums[i]));
        }
        return new_str.toString();
    }
    /* Метод для задания 4 */
    public static ArrayList<String> split(String str) {
        ArrayList<String> result = new ArrayList<>();
        StringBuilder one_Builder = new StringBuilder();
        String[] str_ = str.split("");
        int counter = 0; 
        for (int k = 0; k < str.length(); k++) {
            String current_symbol = str_[k];
            if (current_symbol.equals("(")) {
                counter += 1;
                one_Builder.append(current_symbol);
            }
            else {
                counter -= 1;
                one_Builder.append(current_symbol);
                if (counter == 0) {
                    result.add(one_Builder.toString());
                    one_Builder = new StringBuilder();
                }
            }
        }
        return result;
    }
    /* Метод для задания 5 */
    public static String shortHand(String s) {
        char[] s_list = s.toCharArray();
        StringBuilder result_s = new StringBuilder();
        int counter = 1;
        for (int i = 0; i < s.length(); i++) {
            char current_symbol = s_list[i];
            if (i < s.length() - 1) {
                char next_symbol = s_list[i + 1];
                if (current_symbol == next_symbol) {
                    counter += 1;
                }
                else {
                    if (counter == 1) {
                        result_s.append(current_symbol);
                    }
                    if (counter > 1) {
                        result_s.append(current_symbol + "*" + counter);
                        counter = 1;
                    }
                }
            }
            if (i == s.length() - 1) {
                result_s.append(current_symbol + "*" + counter);
            }
        }
        return result_s.toString();
    }
    /* Метод для задания 6 */
    public static String toRoman(int num) {
        String result_num = "";
        if (num >= 1000) {
            while (num >= 1000) {
                result_num += "M";
                num -= 1000;
            }
        }
        if (num < 1000 && num >= 100) {
            while (num < 1000 && num >= 100) {
                result_num += "C";
                num -= 100;
            }
        }
        if (num < 100 && num >= 50) {
            while (num < 100 && num >= 50) {
                result_num += "L";
                num -= 50;
            }
        }
        if (num < 50 && num >= 10) {
            while (num < 50 && num >= 10) {
                result_num += "X";
                num -= 10;
            }
        }
        if (num < 10 && num >= 5) {
            while (num < 10 && num >= 5) {
                result_num += "V";
                num -= 5;
            }
        }
        if (num < 5 && num >= 1) {
            if (num == 4) result_num += "IV";
            if (num == 3) result_num += "III";
            if (num == 2) result_num += "II";
            if (num == 1) result_num += "I";
        }
        return result_num;
    }
    /* Метод для задания 7 */
    public static String uniqueSubstring(String str) {
        String result = "";
        String s_1 = "";
        String s_2 = "";
        int counter_1 = 0;
        int counter_2 = 0;
        String[] str_list = str.split("");
        for (int index = 0; index < str.length(); index++) {
            String current_symbol = str_list[index];
            if (index % 2 == 0) {
                s_2 += current_symbol;
            }
            else {
                s_1 += current_symbol;
            }
        }
        for (int j = 0; j < s_2.length(); j++) {
            int current_counter_2 = s_2.length() - s_2.replace(String.valueOf(s_2.charAt(j)), "").length(); 
            if (counter_2 < current_counter_2) counter_2 = current_counter_2;
        }
        for (int k = 0; k < s_1.length(); k++) {
            int current_counter_1 = s_1.length() - s_1.replace(String.valueOf(s_1.charAt(k)), "").length();
            if (counter_1 < current_counter_1) counter_1 = current_counter_1;
        }
        if (counter_2 > counter_1) {
            result += "чет";
        }
        else {
            result += "нечет";
        }
        return result;
    }
    /* Методы для задания 8 */
    private static String labNavNext(String str) {
        char[] str_list = str.toCharArray();
        for (int i = 0; i < str_list.length; i++) {
          if (str_list[i] == 'l') {
            str_list[i] = 'r';
            break;
          }
          str_list[i] = 'l';
        }
        return String.valueOf(str_list);
    }
    private static String[] labyrinth(int[][] values) {
        String[] result = {"", ""}; // {log, sum}
        int labyrinth_size = values.length;
        int way_length = labyrinth_size * 2;
        int min_length = 1000000000; 
        String movement_log = "";
        for (int i = 0; i < way_length; i++) {
            movement_log += "l";
        }
        for (int i = 0; i < Math.pow(2, way_length); i++) {
            int x = labyrinth_size - 1;
            int y = labyrinth_size - 1;
            boolean solved = false;
            String current_log = String.valueOf(values[y][x]);
            int current_length = values[y][x];
            for(int j = 0; j < way_length; j++) {
                if (movement_log.charAt(j) == 'l') {
                    x -= 1;
                }
                else {
                    y -= 1;
                }
                if (x < 0 || y < 0 || values[x][y] < 0) {
                    break;
                }
                current_log += "-" + String.valueOf(values[y][x]);
                current_length += values[y][x];
                if (x == 0 && y == 0) {
                    solved = true;
                }
            }  
            if ((solved == true) && (min_length > current_length)) {
                min_length = current_length;
                result[0] = current_log;
                result[1] = String.valueOf(min_length);
            }
            movement_log = labNavNext(movement_log);
        }
        if (result[1] == "") {
            return new String[] {"Прохода нет"};
        }
        return result;
    }
    /* Метод для задания 9 */
    public static String numericOrder(String s) {
        String[] s_list = s.split(" ");
        String[] result = new String[s_list.length];
        for (int k = 0; k < s_list.length; k++) {
            String current_item = s_list[k];
            String new_word = current_item.replaceAll("[0123456789]", "");
            int index = 0;
            for (int j = 0; j < current_item.length(); j++) {
                char symbol = current_item.charAt(j);
                if (Character.isDigit(symbol)) {
                    index = Integer.parseInt(String.valueOf(symbol)) - 1;
                }
                else {
                    continue;
                }
            }
            if (index < result.length) {
                result[index] = new_word;
            }
        }
        return String.join(" ", result);
    }
    /* Метод для задания 10 */
    public static boolean fibString(String s) {
        int[] list = new int[s.length()];
        for (int j = 0; j < s.length(); j++) {
            list[s.charAt(j) - 'A'] += 1;
        }
        int not_a_zero = 0;
        for (int count : list) {
            if (count > 0) {
                not_a_zero += 1;
            }
        }
        int[] new_list = new int[not_a_zero];
        int index = 0;
        for (int item : list) {
            if (item > 0) {
                new_list[index] = item;
                index += 1;
            }
        }
        Arrays.sort(new_list);
        int number_1 = 1;
        int number_2 = 1;
        for (int item : new_list) {
            if (item != number_1) {
                return false;    
            }
            int number = number_1 + number_2;
            number_1 = number_2;
            number_2 = number;
        }
        return true;
    }
}