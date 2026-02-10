class vehicle{
    void start(){
        System.out.println("Vehicle is starting...");
    }
}
class car extends vehicle{
    void drive(){
        System.out.println("Car is driving...");
    }
}
 public class Main{
    public static void main(String[] args){
        car c= new car();
        c.start();
        c.drive();
    }
 }