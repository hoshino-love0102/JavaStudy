public class RunnableExample implements Runnable {
    private String taskName;

    public RunnableExample(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " 작업 실행: " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(taskName + " 인터럽트 발생");
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableExample("작업-A"));
        Thread t2 = new Thread(new RunnableExample("작업-B"));

        t1.start();
        t2.start();
    }
}
