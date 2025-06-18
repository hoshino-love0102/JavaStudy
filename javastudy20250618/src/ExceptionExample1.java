public class ExceptionExample1 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("예외 발생: 0으로 나눌 수 없습니다");
        }
        System.out.println("프로그램 계속 실행...");
    }
}

