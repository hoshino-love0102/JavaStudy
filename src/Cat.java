class Cat extends Animal implements Walkable {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    @Override
    public void walk() {
        System.out.println(name + " is gracefully walking.");
    }
}