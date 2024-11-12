import java.util.regex.*;

public class Example_2 {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        Pattern pattern = Pattern.compile("fox");
        Matcher matcher = pattern.matcher(text);
        String result = matcher.replaceAll("cat");
        System.out.println(result);
    }
}