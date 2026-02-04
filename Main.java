class Human {
    void eat() {
        System.out.println("Eating");
    }
}

class Student extends Human {
    void study() {
        System.out.println("Studying");
    }
}

public class Main {
    public static void main(String[] args) {
        Human h = new Human();

        Student s = new Student();
        s.eat();     // ✅ Inherited
        s.study();   // ✅ Own method
    }
}
