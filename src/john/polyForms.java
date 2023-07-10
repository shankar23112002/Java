package john;

public class polyForms {
    //polymorphism mahindra and bollero
    public static void main(String[] args) {
        mahindra mahi = new mahindra();
        bollero boll = new bollero();

        mahindra mahi2 =  boll;
        mahi2.company();
        boll.company();
        boll.model();
    }
}
