public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Kitty");

        dog.makeSound();
        cat.makeSound();

        ((Walkable) dog).walk();
        ((Walkable) cat).walk();

        dog.sleep();
        cat.sleep();
    }
}