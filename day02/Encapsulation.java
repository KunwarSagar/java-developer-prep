package day02;

public class Encapsulation {
    private String name;
    private int age;

    // Constructor
    public Encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // Simple validation
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Encapsulation person = new Encapsulation("Alice", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modify the person's age
        person.setAge(35);
        System.out.println("Updated Age: " + person.getAge());
    }
}
// ✅ Use private for fields and public getters/setters — that’s encapsulation!
// ✅ Encapsulation helps protect the internal state of an object and allows controlled access to its properties.
// ✅ It allows you to hide the internal implementation details of a class and expose only what is necessary through public methods.
// ✅ In this example, the `Encapsulation` class has private fields `name` and `age`, which cannot be accessed directly from outside the class.
// ✅ Instead, public getter and setter methods are provided to access and modify these fields.
// ✅ This ensures that the internal state of the object can only be changed in controlled ways, such as validating the age before setting it.
// ✅ Encapsulation promotes better maintainability and flexibility in your code, as you can change the internal implementation without affecting the external interface of the class.
// ✅ It also enhances security by preventing unauthorized access to the object's state, ensuring that the data remains consistent and valid throughout the object's lifecycle.
// ✅ By using encapsulation, you can create a clear separation between the object's interface and its implementation, making your code more modular and easier to understand.
// ✅ This allows you to enforce rules and constraints on how the object's data can be accessed and modified, leading to more robust and reliable code.