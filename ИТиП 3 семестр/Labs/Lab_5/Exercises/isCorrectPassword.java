import java.util.regex.*;

public class isCorrectPassword {
    public static void main(String[] args) {
        String password = "SigmaGigachad24";
        StringBuilder mistake = new StringBuilder();
        Pattern password_symbols = Pattern.compile("^[A-Za-z0-9]+$");
        Matcher symbols_Matcher = password_symbols.matcher(password);
        boolean symbols = symbols_Matcher.find();
        if (!symbols) mistake.append("Пароль должен состоять из латинских букв и цифр!\n");
        Pattern password_length = Pattern.compile("^.{8,16}$");
        Matcher length_Matcher = password_length.matcher(password);
        boolean length = length_Matcher.find();
        if (!length) mistake.append("Пароль должен быть длиной от 8 до 16 символов!\n");
        Pattern password_case = Pattern.compile("[A-Z]");
        Matcher case_Matcher = password_case.matcher(password);
        boolean case_ = case_Matcher.find();
        if (!case_) mistake.append("Пароль должен содержать хотя бы одну заглавную букву!\n");
        Pattern password_digits = Pattern.compile("\\d");
        Matcher digits_Matcher = password_digits.matcher(password);
        boolean digits = digits_Matcher.find();
        if (!digits) mistake.append("Пароль должен содержать хотя бы одну цифру!\n");
        if (symbols && length && case_ && digits) {
            System.out.println("Пароль введен верно!");
        }
        else {
            System.out.println(mistake.toString());
        }
    }
}