class Student {

    int id;
    String name;

    // Default Constructor
    Student() {
    }

    // Parameterized Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + "\n" + "Name: " + name);
    }
}

public class Main {

    public static void main(String[] args) {

        // Using default constructor
        Student s1 = new Student();

        // Using parameterized constructor
        Student s2 = new Student(101, "Ansel");

        s1.display();
        s2.display();
    }
}