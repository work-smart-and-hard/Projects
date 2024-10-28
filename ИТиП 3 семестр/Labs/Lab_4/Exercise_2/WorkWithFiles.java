import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class WorkWithFiles {
    public static void main(String[] args) {
        String file_1_path = "C:/Users/Worker/Projects/ИТиП 3 семестр/Labs/Lab_4/Exercise_2/file_1.txt";
        String file_2_path = "C:/Users/Worker/Projects/ИТиП 3 семестр/Labs/Lab_4/Exercise_2/file_2.txt";
        StringBuilder text_Builder = new StringBuilder();
        try {
            File file_1 = new File(file_1_path);
            Scanner reader = new Scanner(file_1);
            FileWriter file_2_Writer = new FileWriter(file_2_path);
            // file_2_Writer.close(); // проверка блока catch (IOException e)
            // reader.close(); // проверка блока catch (Exception e)
            while (reader.hasNextLine()) {
                text_Builder.append(reader.nextLine() + "\n");
            }
            reader.close();
            file_2_Writer.write(text_Builder.toString());
            file_2_Writer.close();
        } catch (IOException e) {
            System.out.println("Запись файла прервана.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Ошибка.");
            e.printStackTrace();
        }
    }
}