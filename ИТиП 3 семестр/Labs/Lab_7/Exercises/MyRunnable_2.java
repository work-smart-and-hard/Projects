import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class MyRunnable_2 implements Runnable {
    private int max_number;
    private HashMap<Integer, Integer> possible_results;
    private int[] numbers;
    private int item;
    public MyRunnable_2(int[] numbers, int item, HashMap<Integer, Integer> possible_results) {
        this.numbers = numbers;
        this.item = item;
        this.possible_results = possible_results;
    }

    public void run() {
        for (int item : numbers) {
            max_number = Math.max(max_number, item);
        }
        possible_results.put(item, max_number);
    }
}

class SecondExercise {
    public static void main(String[] args) {
        HashMap<Integer, Integer> max_line_numbers = new HashMap<>();
        ArrayList<Thread> threads = new ArrayList<>();
        int[][] matrix = {
            {0, 67, 2, 3},
            {4, 5, 6, 9},
            {1, 7, 8, 10},
            {13, 20, 99, 80}
        };
        
        for (int k = 0; k < matrix.length; k++) {
            int current_item = k;
            Runnable matrix_line = new MyRunnable_2(matrix[k], current_item, max_line_numbers);
            Thread new_matrix_line = new Thread(matrix_line);
            new_matrix_line.start();
            threads.add(new_matrix_line);
        }

        for (Thread k : threads) {
            try {
                k.join();
            } catch (InterruptedException e) {
                System.err.println("Возникла ошибка: " + e);
            }
        }
        System.out.println("Максимальный элемент матрицы: " + Collections.max(max_line_numbers.values()));
    }
}