import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.*;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Решение задания 1");
        System.out.println("Для строк 'ABAB' и 'CDCD' результат: " + sameLetterPattern("ABAB", "CDCD"));
        System.out.println("Для строк 'ABCBA' и 'BCDCB' результат: " + sameLetterPattern("ABCBA", "BCDCB"));
        System.out.println("Для строк 'FFGG' и 'CDCD' результат: " + sameLetterPattern("FFGG", "CDCD"));
        System.out.println("Для строк 'FFFF' и 'ABCD' результат: " + sameLetterPattern("FFFF", "ABCD"));
        System.out.println();
        System.out.println("Решение задания 2");
        System.out.println("Для чисел 26 и 39 результатом является: " + memeSum(26, 39));
        System.out.println("Для чисел 122 и 81 результатом является: " + memeSum(122, 81));
        System.out.println("Для чисел 1222 и 30277 результатом является: " + memeSum(1222, 30277));
        System.out.println();
        System.out.println("Решение задания 3");
        System.out.println("Для числа 4666 результатом является: " + digitsCount(4666));
        System.out.println("Для числа 544 результатом является: " + digitsCount(544));
        System.out.println("Для числа 121317 результатом является: " + digitsCount(121317));
        System.out.println("Для числа 0 результатом является: " + digitsCount(0));
        System.out.println("Для числа 12345 результатом является: " + digitsCount(12345));
        System.out.println("Для числа 1289396387328 результатом является: " + digitsCount(1289396387328L));
        System.out.println();
        System.out.println("Решение задания 4");
        System.out.println("Для списка ['cat', 'create', 'sat'] и слова 'caster' результат: " 
        + totalPoints(new String[] {"cat", "create", "sat"}, "caster"));
        System.out.println("Для списка ['trance', 'recant'] и слова 'recant' результат: " 
        + totalPoints(new String[] {"trance", "recant"}, "recant"));
        System.out.println("Для списка ['dote', 'dotes', 'toes', 'set, 'dot', 'dots', 'sted'] и слова 'tossed' результат: " 
        + totalPoints(new String[] {"dote", "dotes", "toes", "set", "dot", "dots", "sted"}, "tossed"));
        System.out.println();
        System.out.println("Решение задания 5");
        System.out.println("Для списка [1, 2, 3, 5, 6, 7, 8, 9] результатом является: " + longestRun(new int[] {1, 2, 3, 5, 6, 7, 8, 9}));
        System.out.println("Для списка [1, 2, 3, 10, 11, 15] результатом является: " + longestRun(new int[] {1, 2, 3, 10, 11, 15}));
        System.out.println("Для списка [5, 4, 2, 1] результатом является: " + longestRun(new int[] {5, 4, 2, 1}));
        System.out.println("Для списка [3, 5, 7, 10, 15] результатом является: " + longestRun(new int[] {3, 5, 7, 10, 15}));
        System.out.println();
        System.out.println("Решение задания 6");
        System.out.println("Для результатов теста ['95%', '83%', '90%', '87%', '88%', '93%'] результат: " 
        + takeDownAverage(new String[] {"95%", "83%", "90%", "87%", "88%", "93%"}));
        System.out.println("Для результатов теста ['10%'] результат: " + takeDownAverage(new String[] {"10%"}));
        System.out.println("Для результатов теста ['53%', '79%'] результат: " + takeDownAverage(new String[] {"53%", "79%"}));
        System.out.println();
        System.out.println("Решение задания 7");
        System.out.println("Для фигуры 'Rook', с положением 'A8' и целевой позицией 'H8' результат: " + canMove("Rook", "A8", "H8"));
        System.out.println("Для фигуры 'Bishop', с положением 'A7' и целевой позицией 'G1' результат: " + canMove("Bishop", "A7", "G1"));
        System.out.println("Для фигуры 'Queen', с положением 'C4' и целевой позицией 'D6' результат: " + canMove("Queen", "C4", "D6"));
        System.out.println();
        System.out.println("Решение задания 8");
        System.out.println("Для чисел 9328 и 456 результат: " + maxPossible(9328, 456));
        System.out.println("Для чисел 523 и 76 результат: " + maxPossible(523, 76));
        System.out.println("Для чисел 9132 и 5564 результат: " + maxPossible(9132, 5564));
        System.out.println("Для чисел 8732 и 91255 результат: " + maxPossible(8732, 91255));
        System.out.println();
        System.out.println("Решение задания 9");
        System.out.println("Для города А 'Los Angeles', времени в городе А 'April 1, 2011 23:23' и города Б 'Canberra' результат: " 
        + timeDifference("Los Angeles", "April 1, 2011 23:23", "Canberra"));
        System.out.println("Для города А 'London', времени в городе А 'July 31, 1983 23:01' и города Б 'Rome' результат: " 
        + timeDifference("London", "July 31, 1983 23:01", "Rome"));
        System.out.println("Для города А 'New York', времени в городе А 'December 31, 1970 13:40' и города Б 'Beijing' результат: " 
        + timeDifference("New York", "December 31, 1970 13:40", "Beijing"));
        System.out.println();
        System.out.println("Решение задания 10");
        System.err.println("Для числа 3 результат: " + isNew(3));
        System.err.println("Для числа 30 результат: " + isNew(30));
        System.err.println("Для числа 321 результат: " + isNew(321));
        System.err.println("Для числа 123 результат: " + isNew(123));
    }
    /* Метод для задания 1 */
    public static boolean sameLetterPattern(String str_1, String str_2) {
        String new_str_1 = str_1;
        String new_str_2 = str_2;
        for (int i = 0; i < str_1.length(); i++) {
            new_str_1 = new_str_1.replaceAll("[" + str_1.charAt(i) + "]", String.valueOf(i));
        }
        for (int j = 0; j < str_2.length(); j++) {
            new_str_2 = new_str_2.replaceAll("[" + str_2.charAt(j) + "]", String.valueOf(j));
        }
        if (new_str_1.equals(new_str_2)) {
            return true;
        }
        return false;
    }
    /* Метод для задания 2 */
    public static int memeSum(int num_1, int num_2) {
        StringBuilder meme_sum = new StringBuilder();
        String str_num_1 = String.valueOf(num_1);
        String str_num_2 = String.valueOf(num_2);
        if (str_num_1.length() != str_num_2.length()) {
            if (str_num_1.length() > str_num_2.length()) {
                int num_2_length = str_num_2.length();
                while (str_num_1.length() != num_2_length) {
                    str_num_2 = "0" + str_num_2;
                    num_2_length = str_num_2.length();
                }
            }
            else {
                int num_1_length = str_num_1.length();
                while (str_num_2.length() != num_1_length) {
                    str_num_1 = "0" + str_num_1;
                    num_1_length = str_num_1.length();
                }
            }
        }
        for (int k = 0; k < str_num_1.length(); k++) {
            for (int i = 0; i < str_num_2.length(); i++) {
                if (k == i) {
                    int current_digit_1 = str_num_1.charAt(k) - '0';
                    int current_digit_2 = str_num_2.charAt(i) - '0';
                    meme_sum.append(String.valueOf(current_digit_1 + current_digit_2));
                }
            }
        }
        return Integer.parseInt(meme_sum.toString());
    }
    /* Метод для задания 3 */
    public static int digitsCount(long number) {
        int counter = 1;
        if (number < 10) {
            return counter;
        }
        return digitsCount(number / 10) + 1;
    }
    /* Метод для задания 4 */
    public static int totalPoints(String[] list, String word) {
        int total = 0;
        char[] word_alphabet = word.toCharArray();
        Arrays.sort(word_alphabet);
        String sort_word = new String(word_alphabet);
        for (int i = 0; i < list.length; i++) {
            String current_word = list[i];
            char[] current_word_alphabet = current_word.toCharArray();
            Arrays.sort(current_word_alphabet);
            String sort_current_word = new String(current_word_alphabet);
            int current_length = sort_current_word.length();
            boolean flag = true;
            if (current_length < 6) {
                for (int k = 0; k < sort_current_word.length(); k++) {
                    if (sort_word.contains(String.valueOf(sort_current_word.charAt(k))) == false) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    if (current_length == 3) total += 1;
                    if (current_length == 4) total += 2;
                    if (current_length == 5) total += 3;
                }
            }
            else {
                if (sort_word.contains(sort_current_word)) {
                    total += 54;
                }
            }
        }
        return total;
    }
    /* Метод для задания 5 */
    public static int longestRun(int[] numbers) {
        int counter = 1;
        int max_counter = 1;
        for (int j = 0; j < numbers.length - 1; j++) {
            int current_number = numbers[j];
            int next_number = numbers[j + 1];
            if (Math.abs(next_number - current_number) == 1) {
                counter += 1;
                max_counter = Math.max(max_counter, counter);
            }
            else {
                counter = 1;
            }
        }
        return max_counter;
    }
    /* Метод для задания 6 */
    public static String takeDownAverage(String[] results) {
        int sum = 0;
        int max_result = 0;
        for (int k = 0; k < results.length; k++) {
            int current_result = Integer.parseInt(results[k].replaceAll("[%]", ""));
            max_result = Math.max(max_result, current_result);
            sum += current_result;
        }
        double average = (double) sum / results.length;
        double result = (average - 5.0) * (results.length + 1) - sum;
        return String.valueOf((int) Math.floor(result)) + "%";
    }
    /* Метод для задания 7 */
    public static boolean canMove(String figure, String place, String goal) {
        int x = Math.abs(place.charAt(0) - goal.charAt(0));
        int y = Math.abs(place.charAt(1) - goal.charAt(1));
        if (figure == "Pawn") {
            if (x == 0 && (y == 0 || y == 1 || y == 2)) return true;
        }
        if (figure == "Knight") {
            if ((x == 2 && y == 1) || (x == 1 && y == 2)) return true;
        }
        if (figure == "Bishop") {
            if (x == y) return true;
        }
        if (figure == "Rook") {
            if (x == 0 || y == 0) return true;
        }
        if (figure == "Queen") {
            if (x == 0 || y == 0 || x == y) return true;
        }
        if (figure == "King") {
            if ((x >= -1 && x <= 1) && (y >= -1 && y <= 1)) return true;
        }
        return false;
    }
    /* Метод для задания 8 */
    public static int maxPossible(int number_1, int number_2) {
        String str_number_1 = String.valueOf(number_1);
        String str_number_2 = String.valueOf(number_2);
        char[] number_2_digits = str_number_2.toCharArray();
        Arrays.sort(number_2_digits);
        String sorted_number_2 = new String(number_2_digits);
        for (int j = sorted_number_2.length() - 1; j > -1; j--) {
            for (int k = 0; k < str_number_1.length(); k++) {
                char current_symbol_1 = str_number_1.charAt(k);
                char current_symbol_2 = sorted_number_2.charAt(j);
                if (current_symbol_1 < current_symbol_2) {
                    str_number_1 = str_number_1.replace(current_symbol_1, current_symbol_2);
                    break;
                }
            }
        }
        return Integer.parseInt(str_number_1);
    }
    /* Метод для задания 9 */
    public static String timeDifference(String cityA, String timestamp, String cityB) {
		ArrayList<String> months = new ArrayList<String>();
		months.add("0");
		months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
		months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
		months.add("September");
        months.add("October");
        months.add("November"); 
        months.add("December");
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(timestamp); matcher.find();
		int timestamp_day = Integer.valueOf(matcher.group()); 
        matcher.find();
		int timestamp_year = Integer.valueOf(matcher.group()); 
        matcher.find();
		int timestamp_month = months.indexOf(timestamp.replaceAll("\\s.*", ""));
		int timestamp_hours = Integer.valueOf(matcher.group()); 
        matcher.find();
		int timestamp_minutes = Integer.valueOf(matcher.group());
		HashMap<String, Double> gmt_city = new HashMap<>();
		gmt_city.put("Los Angeles", -8.0);
        gmt_city.put("New York", -5.0);
        gmt_city.put("Caracas", -4.5);
		gmt_city.put("Buenos Aires", -3.0);
        gmt_city.put("London", 0.0);
        gmt_city.put("Rome", 1.0);
		gmt_city.put("Moscow", 3.0);
        gmt_city.put("Tehran", 3.5);
        gmt_city.put("New Delhi", 5.5);
		gmt_city.put("Beijing", 8.0);
        gmt_city.put("Canberra", 10.0);
		double offset = gmt_city.get(cityB) - gmt_city.get(cityA);
		timestamp_minutes += (offset % 1) * 60;
		timestamp_hours += offset - (offset % 1);
		if (timestamp_minutes < 0) { 
            timestamp_minutes += 60; 
            timestamp_hours -= 1; 
        }
		if (timestamp_minutes >= 60) { 
            timestamp_minutes -= 60; 
            timestamp_hours += 1; 
        }
		if (timestamp_hours < 0) { 
            timestamp_hours += 24; 
            timestamp_day -= 1; 
        }
		if (timestamp_hours >= 24) { 
            timestamp_hours -= 24; 
            timestamp_day += 1; 
        }
		if (timestamp_day < 1) { 
            timestamp_month -= 1; 
            timestamp_day += days[(timestamp_month - 1) % 12 + 1]; 
        }
		if (timestamp_day > days[timestamp_month]) { 
            timestamp_day -= days[timestamp_month]; 
            timestamp_month += 1; 
        }
		if (timestamp_month < 1) { 
            timestamp_month += 12; 
            timestamp_year -= 1; 
        }
		if (timestamp_month > 12) { 
            timestamp_month -= 12; 
            timestamp_year += 1; 
        }
        StringBuilder result_time = new StringBuilder();
        result_time.append(timestamp_year + "-" + timestamp_month + "-" + timestamp_day + " ");
        if (timestamp_hours < 10) {
            result_time.append("0" + timestamp_hours + ":");
        }
        else {
            result_time.append(timestamp_hours + ":");
        }
        if (timestamp_minutes < 10) {
            result_time.append("0" + timestamp_minutes);
        }
        else {
            result_time.append(timestamp_minutes);
        }
		return result_time.toString();
	}
    /* Метод для задания 10 */
    public static boolean isNew(int number) {
        if (number < 10) {
            return true;
        }
        ArrayList<Integer> number_digits = new ArrayList<>();
        while (number > 0) {
            number_digits.add(number % 10);
            number /= 10;
        }
        int max_digit = number_digits.getLast();
        number_digits.removeLast();
        boolean skip_0 = true;
        while (!number_digits.isEmpty()) {
            int current_digit = number_digits.getLast();
            number_digits.removeLast();
            if (skip_0) {
                if (current_digit == 0) {
                    continue;
                }
                skip_0 = false;
            }
            if (current_digit < max_digit) {
                return false;
            }
        }
        return true;
    }
}