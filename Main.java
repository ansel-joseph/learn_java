import java.util.Scanner;
class car{
    String model;
    String company;
    double price;
    car(){
        System.out.println("Default constructor called");
    }       
    car(String model, String company, double price){
        this.model=model;
        this.company=company;
        this.price=price;
    }
    void display(){
        System.out.println("Model: "+model);
        System.out.println("Company: "+company);
        System.out.println("Price: "+price);
    }

}
public class Main{
    public static void main(String[] args){
        car c1 = new car("Cybertruck","Tesla", 6000000.0);
        c1.display();
        car c2=new car();
        c2.display();


    }
}