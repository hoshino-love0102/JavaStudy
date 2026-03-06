package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a=5;
        int b=2;

        int sum = a + b;
        int diff = a - b;
        int multi = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a - b + " = " + diff);
        System.out.println(a * b + " = " + multi);
        System.out.println(a / b + " = " + div);
        System.out.println(a % b + " = " + mod);
    }
}
