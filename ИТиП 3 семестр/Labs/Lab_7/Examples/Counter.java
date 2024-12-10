public class Counter {
    private int count;
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class MyThreadCounter extends Thread {
    private Counter counter;

    public MyThreadCounter(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

class MainCounter {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThreadCounter thread1 = new MyThreadCounter(counter);
        MyThreadCounter thread2 = new MyThreadCounter(counter);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Count: " + counter.getCount());
    }
}