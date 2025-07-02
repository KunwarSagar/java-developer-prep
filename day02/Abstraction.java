package day02;

public class Abstraction {
    // Abstract class
    public static abstract class Shape {
        public abstract void draw();
    }

    // Concrete class
    public static class Circle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a circle");
        }
    }

    // Another concrete class
    public static class Rectangle extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a rectangle");
        }
    }

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();       // Outputs: Drawing a circle
        rectangle.draw();    // Outputs: Drawing a rectangle
    }
}
// ✅ Abstract classes/interfaces expose what a class must do, not how
// ✅ Abstraction allows you to define a common interface for different classes, focusing on what they do rather than how they do it.
// ✅ It helps in reducing complexity by hiding unnecessary details and exposing only the essential features of an object.
// ✅ In this example, the `Shape` class is an abstract class that defines a method `draw`, which must be implemented by any concrete class that extends `Shape`.
// ✅ The `Circle` and `Rectangle` classes provide their own implementations of the `draw` method, demonstrating how abstraction allows different shapes to be drawn without needing to know the specifics of each shape's implementation.
// ✅ This allows for a cleaner and more modular design, where the focus is on the behavior of the shapes rather than the details of their implementation.
// ✅ This enables you to work with different shapes through a common interface, making your code more flexible and easier to maintain.
// ✅ You can create a list of `Shape` objects and call `draw` on each one, regardless of whether it's a `Circle` or `Rectangle`, demonstrating polymorphism in action.
