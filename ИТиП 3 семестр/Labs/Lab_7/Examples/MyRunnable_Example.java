public class MyRunnable_Example implements Runnable {
    public void run() {
        System.out.println("Hello from runnable!");
    }
}

class Main_Example_2 {
    public static void main(String[] args) {
        MyRunnable_Example runnable = new MyRunnable_Example();
        Thread thread_2 = new Thread(runnable);
        thread_2.start();
    }
}