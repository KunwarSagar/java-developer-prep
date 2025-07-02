package day02;

public class Inheritance {
    // Base class
    public static class Animal {
        public void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Derived class
    public static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Dog barks");
        }
    }

    // Another derived class
    public static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Cat meows");
        }
    }   

    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Call makeSound on each instance
        myDog.makeSound(); // Outputs: Dog barks
        myCat.makeSound(); // Outputs: Cat meows

        // Demonstrating polymorphism
        Animal[] animals = {new Dog(), new Cat()};
        for (Animal animal : animals) {
            animal.makeSound(); // Outputs: Dog barks, then Cat meows
        }
    }
}
// ✅ Reuse functionality by extending a base class
// ✅ Inheritance allows you to create a new class based on an existing class, inheriting its properties and methods.
// ✅ In this example, the `Dog` and `Cat` classes inherit from the `Animal` class, reusing its `makeSound` method while providing their own specific implementations.
// ✅ This promotes code reuse and establishes a natural hierarchy between classes, allowing for more organized and maintainable code.
// ✅ It also allows for polymorphism, where you can treat objects of derived classes as objects of the base class (`Animal`), enabling you to write more flexible and reusable code.
// ✅ The `Animal` class serves as a base class, while `Dog` and `Cat` are derived classes that extend `Animal` and override the `makeSound` method to provide their specific implementations.
//// ✅ This demonstrates how inheritance allows you to build upon existing functionality, creating a clear relationship between classes
// and enabling polymorphism, where you can use a single interface (`Animal`) to represent different types of animals (`Dog`, `Cat`) with their own behaviors.
// ✅ This makes your code more modular and easier to maintain, as you can add new animal types without modifying existing code, simply by creating new classes that extend `Animal` and implement their specific behaviors.