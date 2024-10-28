public class ArrayAverage {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        double average = 0;
        // arr = null;  // проверка работы блока catch (NullPointerException e)
        try {
            // i < arr.length + 1 в цикле for // проверка работы блока catch (ArrayIndexOutOfBoundsException e)
            for (int i = 0; i < arr.length + 1; i++) { 
                sum += arr[i];
            }
            average = sum / (double) arr.length;
            System.out.println(average);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: неверный индекс массива.");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Ошибка: нулевой указатель на массив.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Ошибка.");
            e.printStackTrace();
        }
    }
}