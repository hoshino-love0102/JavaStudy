public class ThreadBasic extends Thread {
    private String threadName;

    public ThreadBasic(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " 실행 중: " + i);
            try {
                Thread.sleep(500); // 0.5초 대기
            } catch (InterruptedException e) {
                System.out.println(threadName + " 인터럽트 발생");
            }
        }
    }

    public static void main(String[] args) {
        ThreadBasic t1 = new ThreadBasic("스레드-1");
        ThreadBasic t2 = new ThreadBasic("스레드-2");

        t1.start();
        t2.start();
    }
}
