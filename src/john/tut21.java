package john;
//import java.util.Scanner;

class cars{
    String name ;
    int rate;
    public void setName(String newName){
        name = newName;
    }
    public void setRate(int newRate){
        rate = newRate;
    }
    /*
    public void setInfo(String newName, int newRate){
        name = newName;
        rate = newRate;//it also applicable
    }
    */
}

class persons{
    String pname;
    int weight;
    public void setPname(String pname){
        this.pname = pname;
    }
    public  void setWeight(int weight){
        this.weight = weight;
    }
}
public class tut21 {
    public static void main(String[] args) {

        cars car = new cars();

        car.setName("Ferrari");
        car.setRate(12000);

        System.out.println(car.name);
        System.out.println(car.rate);

        persons per = new persons();

        per.setPname("john");
        per.setWeight(50);

        System.out.println(per.pname);
        System.out.println(per.weight);


    }
}
