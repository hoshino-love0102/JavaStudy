class Counter {
    private int count = 0;

    public synchronized void increment(String threadName) {
        count++;
        System.out.println(threadName + " → 현재 count: " + count);
    }

    public int getCount() {
        return count;
    }
}

public class SyncExample implements Runnable {
    private Counter counter;
    private String threadName;

    public SyncExample(Counter counter, String name) {
        this.counter = counter;
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.increment(threadName);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(threadName + " 인터럽트 발생");
            }
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(new SyncExample(counter, "스레드-1"));
        Thread t2 = new Thread(new SyncExample(counter, "스레드-2"));

        t1.start();
        t2.start();
    }
}
