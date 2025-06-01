package Main.java;

class Point {
    int x;
    int y;

    // 기본 생성자
    Point() {
        this(0, 0);
    }

    // x만 받는 생성자
    Point(int x) {
        this(x, 0);
    }

    // x, y 받는 생성자
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
