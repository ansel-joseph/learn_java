class ElectronicDevice{
    void powerOn(){
        System.out.println("Device is powering on");
    }
}
class Computer extends ElectronicDevice{
    void compute(){
        System.out.println("Computer is proecessing data");
    }
}
class Laptop extends Computer{
    void portable(){
        System.out.println("Laptop is portable");
    }
}
public class Main{
    public static void main (String[] args){
        Laptop l = new Laptop();
        l.powerOn();
        l.compute();
        l.portable();
    }
}