package john;

public class suzukiBike implements Info{
    private int speed = 200;

    public void sBikes(){
        System.out.println("Welcome to Suzuki Bikes");
    }

    public void showInfo() {
        System.out.println("the speed of the bike is "+speed);
    }
}
