class parameter{
    int id;
    String name;
    parameter(int id, String name){
        this.id=id;
        this.name=name;
    }
}

public class Paracon{
    public static void main(String [] args){
        parameter p = new parameter(23, "Ansel");
        System.out.println(p.id);
        System.out.println(p.name);
    }
}
