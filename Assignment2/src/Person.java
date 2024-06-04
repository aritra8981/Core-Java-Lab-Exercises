public class Person {
    // Attributes of the Person class
    String name;
    int age;

    // Constructor to initialize the Person object
    public Person(String name, int age) {
        this.name = name; // Set the name of the person
        this.age = age;   // Set the age of the person
    }

    // Method to display the details of the Person
    public void display() {
        System.out.println("Name Of Person: " + name); // Print the person's name
        System.out.println("Age Of Person: " + age);   // Print the person's age
    }
}
