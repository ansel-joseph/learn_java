class Student{
    int rollno;
    String name;
    int marks;
    Student(int rollno, String name, int marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }
    void display(){
        System.out.println("Rollno: "+ rollno);
        System.out.println("Name: "+ name);
        System.out.println("Marks: "+ marks);
    }
}
public class Main{
    public static void main(String[] args){
        Student s1 = new Student(001, "Sarthak", 78);
        s1.display();

    }

}