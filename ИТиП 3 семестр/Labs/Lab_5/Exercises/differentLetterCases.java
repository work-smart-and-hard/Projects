import java.util.regex.*;
import java.util.ArrayList;

public class differentLetterCases {
    public static void main(String[] args) {
        ArrayList<String> found_matches = new ArrayList<>();
        String text = "BasketballForeverInMyLife :)";
        System.out.println("Исходная строка: " + text);
        String result = text;
        Pattern pattern = Pattern.compile("[a-z][A-Z]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            found_matches.add(matcher.group());
            result = result.replaceFirst(found_matches.getLast(), "💪");
        }
        for (String item : found_matches) {
            result = result.replaceFirst("💪", "!" + item + "!");    
        }
        System.out.println("Результат: " + result);
    }
}