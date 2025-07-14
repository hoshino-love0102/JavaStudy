abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    //추상 메서드
    abstract void makeSound();

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}