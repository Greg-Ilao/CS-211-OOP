class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();  // Animal reference → Dog object
        a.sound();      // prints: Dog barks

        a = new Cat();  // Animal reference → Cat object
        a.sound();      // prints: Cat meows
    }
}
