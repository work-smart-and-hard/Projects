import java.util.regex.*;

public class Example_1 {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        Pattern pattern = Pattern.compile("fox");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Match found!");
        }
    }
}