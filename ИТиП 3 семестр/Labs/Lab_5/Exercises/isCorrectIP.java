import java.util.regex.*;

public class isCorrectIP {
    public static void main(String[] args){
        String ip_address = "255.234.243.123";
        try {
            Pattern pattern = Pattern.compile("^([0-9]|[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." + 
            "([0-9]|[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\." +
            "([0-9]|[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.([0-9]|[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$");
            Matcher matcher = pattern.matcher(ip_address);
            if (matcher.find()) {
                System.out.println("IP-адрес введен верно!");
            }
            else {
                System.out.println("IP-адрес введен неверно.");
            }
        } catch (PatternSyntaxException e) {
            System.out.println("Ошибка: неверное регулярное выражение");
            System.err.println(e);
        }
    }
}