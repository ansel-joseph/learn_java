import java.util.*;
public class Student{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Enter your age: ");
        if(age>=18){
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}