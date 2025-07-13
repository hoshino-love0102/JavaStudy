public class MethodOverridingTest1 {
    static class A {
        void print() {
            System.out.println("A의 print()");
        }
    }
    static class B extends A {
        @Override
        void print() {
            System.out.println("B의 print()");
        }
    }

    public static void main(String[] args) {
        B objb = new B();
        objb.print();   // B의 print() 가 출력됨
    }
}
