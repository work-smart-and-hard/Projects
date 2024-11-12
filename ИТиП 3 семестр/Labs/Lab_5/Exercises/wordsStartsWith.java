import java.util.regex.*;

public class wordsStartsWith {
    public static void main(String[] args) {
        String text = "Giganyam Gigachad Sigma GYM game strength";
        String symbol = "A";
        try {
            Pattern pattern = Pattern.compile("\\b" + symbol + "\\S*");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (PatternSyntaxException e) {
            System.out.println("Ошибка: неверное регулярное выражение");
            System.err.println(e);
        }
    }
}