package john;

public class suzukiCar implements Info{
    private String name;

    public suzukiCar(String name) {
        this.name = name;
    }
    public void greet(){
        System.out.println("Welcome to Suzuki Cars");
        System.out.println("the name of the car in method is "+name);
    }


    @Override
    public void showInfo() {
        System.out.println("The name of the car in interface is "+name);
    }
}
