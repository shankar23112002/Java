package Wipro;

//Enter only posititve value and short value
import java.util.*;
public class Fcs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;

        //do while loop for get the positive value if not loop again run
        do{
            System.out.println("enter positive value :");
            while(!sc.hasNextInt()){
                System.out.println("Not valid Enter again");
                sc.next();
            }
            num = sc.nextInt();
        }while(num < 0);

        System.out.println(num);

        short num2;
        do{
            System.out.println("Enter short data type value: ");
        }while(!sc.hasNextShort() || (num2 = sc.nextShort()) <=0);

        System.out.println(num2);
    }
}
