import java.util.Arrays;

public class MyThread_1 extends Thread {
    private int sum;
    private int[] numbers;
    public MyThread_1(int[] numbers) {
        this.numbers = numbers;
    }

    public void run() {
        for (int item : numbers) {
            sum += item;
        }
    }

    public int getSum() {
        return sum;
    }
}

class FirstExercise {
    public static void main(String[] args) {
        int[] list_of_numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        MyThread_1 first_half = new MyThread_1(Arrays.copyOfRange(list_of_numbers, 0, (list_of_numbers.length / 2)));
        MyThread_1 second_half = new MyThread_1(Arrays.copyOfRange(list_of_numbers, (list_of_numbers.length / 2), list_of_numbers.length));
        first_half.start();
        second_half.start();
        try {
            first_half.join();
            second_half.join();
        } catch (InterruptedException e) {
            System.err.println("Ошибка: " + e);
        }
        System.out.println("Результат суммы первой половины списка: " + first_half.getSum());
        System.out.println("Результат суммы второй половины списка: " + second_half.getSum());
        System.out.println("Общая сумма элементов всего списка: " + (first_half.getSum() + second_half.getSum()));
    }
}