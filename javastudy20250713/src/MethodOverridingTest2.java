public class MethodOverridingTest2 {
    static class Animal {
        void sound() {
            System.out.println("동물이 소리를 낸다");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("멍멍");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("야옹~");
        }
    }

    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.sound();    // 멍멍
        animal2.sound();    // 야옹~
    }
}
