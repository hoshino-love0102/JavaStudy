class Dog extends Animal implements Walkable {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }

    @Override
    public void walk() {
        System.out.println(name + " is walking.");
    }
}