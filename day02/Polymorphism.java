package day02;

public class Polymorphism {
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
// ✅ Same interface, different behaviors (runtime polymorphism)
// ✅ Polymorphism allows you to use a single interface to represent different underlying forms (data types).
// ✅ It enables you to write more flexible and reusable code by allowing methods to operate on objects of different classes that share a common interface or base class.
// ✅ In this example, the `makeSound` method is overridden in both `Dog` and `Cat` classes, demonstrating polymorphism where the method behavior depends on the actual object type at runtime.
// ✅ This allows for dynamic method resolution, where the method that gets executed is determined at runtime based on the actual object type, not the reference type.
