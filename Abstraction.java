abstract class Animal {

    // Abstract method
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Dog obj = new Dog();

        obj.sound();
        obj.eat();
    }
}