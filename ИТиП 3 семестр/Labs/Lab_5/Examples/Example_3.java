import java.util.regex.*;

public class Example_3 {
    public static void main(String[] args) {
        String email = "example@mail.com";
        Pattern pattern = Pattern.compile("\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[a-z]{2,}\\b");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Valid email address!");
        }
    }
}