package lamda;

public class LambdaExample {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("람다식으로 출력!");
        r.run();
    }
}