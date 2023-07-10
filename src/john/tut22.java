package john;

class lorry{
    private String lorryName;
    private int weight;
    public lorry(){
        //we can call another constructor in one constructor by this keyword ,but it must be in first line of the constructor
        this("Eicher",10);
        System.out.println("lorry first constructor is running..");
    }
    public lorry(String lorryName){
        System.out.println("second constructor is running");
        this.lorryName = lorryName;
        System.out.println(lorryName);
    }

    public lorry(String lorryName,int weight){
        this.lorryName = lorryName;
        this.weight = weight;
        System.out.println("Third constructor is running ."+lorryName+" "+weight +"tons");
    }

}
public class tut22 {
    public static void main(String[] args) {

        lorry loo1 = new lorry();
        lorry loo2 = new lorry("mercedes");
        lorry loo3 = new lorry("Ashok leland",20);

    }
}
