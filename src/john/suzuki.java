package john;

public class suzuki {
    public static void main(String[] args) {
        suzukiCar sc = new suzukiCar("Baleno");
        sc.greet();
        sc.showInfo();//another calling method

        Info info1 = new suzukiCar("Dzire");
        info1.showInfo();

        Info info2 = new suzukiBike();
        info2.showInfo();

    }
}
