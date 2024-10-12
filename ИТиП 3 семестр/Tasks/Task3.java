import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Решение задания 1");
        System.out.println("Для строк 'ratio' и 'orator' результат: " + isStrangePair("ratio", "orator") + ";");
        System.out.println("Для строк 'sparkling' и 'groups' результат: " + isStrangePair("sparkling", "groups") + ";");
        System.out.println("Для строк 'bush' и 'hubris' результат: " + isStrangePair("bush", "hubris") + ";");
        System.out.println("Для строк '' и '' результат: " + isStrangePair("", "") + ";");
        System.out.println();
        System.out.println("Решение задания 2");
        String[][] sale = {{"Laptop", "124200"}, {"Phone", "51450"}, {"Headphones", "13800"}};
        System.out.println("Для данных ([[Laptop, 124200], [Phone, 51450], [Headphones, 13800]], 25) результат: " 
        + discountedGoods(sale));
        System.out.println();
        System.out.println("Решение задания 3");
        System.out.println("Для данных (0, 0, 5, 2, 2) результат: " + successShot(0, 0, 5, 2, 2) + ";");
        System.out.println("Для данных (-2, -3, 4, 5, -6) результат: " + successShot(-2, -3, 4, 5, -6) + ";");
        System.out.println();
        System.out.println("Решение задания 4");
        System.out.println("Для числа 243 результатом является: " + parityAnalysis(243) + ";");
        System.out.println("Для числа 12 результатом является: " + parityAnalysis(12) + ";");
        System.out.println("Для числа 3 результатом является: " + parityAnalysis(3) + ";");
        System.out.println();
        System.out.println("Решение задания 5");
        System.out.println("Для строк 'rock' и 'paper' результат: " + rps("rock", "paper") + ";");
        System.out.println("Для строк 'paper' и 'rock' результат: " + rps("paper", "rock") + ";");
        System.out.println("Для строк 'paper' и 'scissors' результат: " + rps("paper", "scissors") + ";");
        System.out.println("Для строк 'scissors' и 'scissors' результат: " + rps("scissors", "scissors") + ";");
        System.out.println("Для строк 'scissors' и 'paper' результат: " + rps("scissors", "paper") + ";");
        System.out.println();
        System.out.println("Решение задания 6");
        System.out.println("Для числа 39 результатом является: " + bugger(39) + ";");
        System.out.println("Для числа 999 результатом является: " + bugger(999) + ";");
        System.out.println("Для числа 4 результатом является: " + bugger(4) + ";");
        System.out.println();
        System.out.println("Решение задания 7");
        String[][] goods = {{"Скакалка", "550", "8"}, {"Шлем", "3750", "4"}, {"Мяч", "2900", "10"}};
        System.out.println(mostExpensive(goods));
        System.out.println();
        System.out.println("Решение задания 8");
        System.out.println("Для строки 'abcba' результат: " + longestUnique("abcba") + ";");
        System.out.println("Для строки 'bbb' результат: " + longestUnique("bbb") + ";");
        System.out.println();
        System.out.println("Решение задания 9");
        System.out.println("Для строки 'automation' и префикса 'auto-' результат: " + isPrefix("automation", "auto-") + ";");
        System.out.println("Для строки 'arachnophobia' и суффикса '-phobia' результат: " + isPrefix("arachnophobia", "-phobia") + ";");
        System.out.println("Для строки 'retrospect' и префикса 'sub-' результат: " + isPrefix("retrospect", "sub-") + ";");
        System.out.println("Для строки 'vocation' и суффикса '-logy' результат: " + isPrefix("vocation", "-logy") + ";");
        System.out.println();
        System.out.println("Решение задания 10");
        System.out.println("Для кирпича размером 1х1х1 и отверстием 1х1 результат: " + doesBrickFit(1, 1, 1, 1, 1) + ";");
        System.out.println("Для кирпича размером 1х2х1 и отверстием 1х1 результат: " + doesBrickFit(1, 2, 1, 1, 1) + ";");
        System.out.println("Для кирпича размером 1х2х2 и отверстием 1х1 результат: " + doesBrickFit(1, 2, 2, 1, 1) + ";");
    }
    /* Метод для задания 1 */
    public static boolean isStrangePair(String str_1, String str_2) {
        if (str_1.length() == 0 && str_2.length() == 0) {
            return true;
        }
        String str_1_first = str_1.substring(0, 1);
        String str_1_last = str_1.substring(str_1.length() - 1);
        String str_2_fisrt = str_2.substring(0, 1);
        String str_2_last = str_2.substring(str_2.length() - 1);
        if (((str_1_first.equals(str_2_last)) && (str_1_last.equals(str_2_fisrt)))) {
            return true;
        }
        return false;
    }
    /* Метод для задания 2 */
    public static ArrayList<ArrayList<String>> discountedGoods(String[][] goods) {
        ArrayList<ArrayList<String>> new_goods = new ArrayList<>();
        double discount = 25.0;
        double percent_discount = discount / 100;
        for (int i = 0; i < goods.length; i++) {
            ArrayList<String> current_good = new ArrayList<>();
            String name = goods[i][0];
            String price = goods[i][1];
            int price_with_discount = (int) Math.ceil(Double.parseDouble(price) * (1.0 - percent_discount));
            current_good.add(name);
            current_good.add(String.valueOf(price_with_discount));
            new_goods.add(current_good);
        }
        return new_goods;
    }
    /* Метод для задания 3 */
    public static boolean successShot(int x, int y, int r, int m, int n) {
        int square_distance = (m - x) * (m - x) + (n - y) * (n - y);
        double distance_to_center = Math.sqrt(Double.valueOf(square_distance));
        if (distance_to_center < r) {
            return true;
        }
        return false;
    }
    /* Метод для задания 4 */
    public static boolean parityAnalysis(int number) {
        int first_digit = number / 100;
        int second_digit = (number / 10) % 10;
        int third_digit = number % 10;
        int sum_ = first_digit + second_digit + third_digit;
        if (sum_ % 2 == number % 2) {
            return true;
        }
        return false;
    }
    /* Метод для задания 5 */
    public static String rps(String player_1, String player_2) {
        String win_1 = "Player 1 wins";
        String win_2 = "Player 2 wins";
        String tie = "Tie";
        String result = "";
        if (player_1 == "rock") {
            if (player_2 == "paper") result = win_2;
            if (player_2 == "scissors") result = win_1;
            if (player_2 == "rock") result = tie;
        }
        if (player_1 == "paper") {
            if (player_2 == "paper") result = tie;
            if (player_2 == "scissors") result = win_2;
            if (player_2 == "rock") result = win_1;
        }
        if (player_1 == "scissors") {
            if (player_2 == "paper") result = win_1;
            if (player_2 == "scissors") result = tie;
            if (player_2 == "rock") result = win_2;
        }
        return result;
    }
    /* Метод для задания 6 */
    public static int bugger(int num) {
        int counter = 0;
        if (num <= 9) {
            counter = 0;
        }
        if (num >= 100) {
            while (num >= 100) {
                int digit_1 = num / 100;
                int digit_2 = (num / 10) % 10;
                int digit_3 = num % 10;
                num = digit_1 * digit_2 * digit_3;
                counter += 1;
            }
        }
        if (num >= 10 && num <= 99) {
            while (num >= 10 && num <= 99) {
                int digit_1 = num / 10;
                int digit_2 = num % 10;
                num = digit_1 * digit_2;
                counter += 1;
            }
        }
        return counter;
    }
    /* Метод для задания 7 */
    public static String mostExpensive(String[][] goods_list) {
        int max_price = 0;
        String max_price_name = "";
        for (int i = 0; i < goods_list.length; i++) {
            String current_name = goods_list[i][0];
            String current_price = goods_list[i][1];
            String current_quantity = goods_list[i][2];
            int price = Integer.parseInt(current_price);
            int quantity = Integer.parseInt(current_quantity);
            if (max_price < price * quantity) {
                max_price_name = current_name;
                max_price = price * quantity;
            }
        }
        return "Наибольшая общая стоимость у предмета " + max_price_name + " - " + max_price;
    }
    /* Метод для задания 8 */
    public static String longestUnique(String str) {
        StringBuilder result = new StringBuilder();
        String[] symbols = str.split("");
        for (int i = 0; i < str.length(); i++) {
            String current_symbol = symbols[i];
            String previos_symbols = str.substring(0, i);
            if(previos_symbols.contains(current_symbol) == false) {
                result.append(current_symbol);
            }
        }
        return result.toString();
    }
    /* Методы для задания 9 */
    public static boolean isPrefix(String word, String prefix) {
        String filter_for_prefix = "[-]";
        String new_prefix = prefix.replaceAll(filter_for_prefix, "");
        if (word.contains(new_prefix)) {
            return true;
        }
        return false;
    }
    public static boolean isSuffix(String word, String suffix) {
        String filter_for_suffix = "[-]";
        String new_suffix = suffix.replaceAll(filter_for_suffix, "");
        if (word.contains(new_suffix)) {
            return true;
        }
        return false;
    }
    /* Метод для задания 10 */
    public static boolean doesBrickFit(int a, int b, int c, int w, int h) {
        int area = w * h;
        int brick_area_1 = a * b;
        int brick_area_2 = b * c;
        int brick_area_3 = a * c;
        int min_brick_area = Math.min(brick_area_1, Math.min(brick_area_2, brick_area_3));
        if (min_brick_area <= area) {
            return true;
        }
        return false;
    }
}