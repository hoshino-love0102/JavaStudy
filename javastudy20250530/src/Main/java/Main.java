package Main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Point p1 = new Point(); // 기본 생성자
        int x2 = sc.nextInt();
        Point p2 = new Point(x2); // x만 입력받는 생성자

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        Point p3 = new Point(x3, y3); // x, y 둘 다 받는 생성자

        p1.print();
        p2.print();
        p3.print();
    }
}
