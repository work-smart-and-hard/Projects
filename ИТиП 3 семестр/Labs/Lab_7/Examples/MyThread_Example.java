public class MyThread_Example extends Thread {
    public void run() {
        System.out.println("Hello from thread!");
    }
}

class Main_Example_1 {
    public static void main(String[] args) {
        MyThread_Example thread_1 = new MyThread_Example();
        thread_1.start();
    }
}