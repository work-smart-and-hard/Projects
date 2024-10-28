import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(customDivision(12.2, 5.1));
            System.out.println(customDivision(34.5, 8.6));
            System.out.println(customDivision(46.8, 9.7));
            System.out.println(customDivision(75.8, 0)); // проверка блока catch (IOException File_error)
        } catch (CustomDivisionException e) {
            System.out.println("Как же так? Надо учить математику...");
            System.err.println(e);
            String file_name = "Error_log.txt";
            try {
                FileWriter log_File = new FileWriter(file_name, true);
                log_File.write(e.toString() + "\n");
                log_File.close();
            } catch (IOException file_error) {
                System.out.println("Ошибка при логировании в файл.");
                file_error.printStackTrace();
            }
        } catch (Exception e) {
            System.out.println("Ошибка.");
            System.err.println(e);
        }
    }
    public static double customDivision(double number, double divider) throws CustomDivisionException {
        if (divider == 0) {
            throw new CustomDivisionException("Делить число " + number + " на 0 нельзя!");
        }
        return number / divider;
    }
}