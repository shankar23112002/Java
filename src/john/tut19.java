package john;

import java.lang.Math;
import java.util.Scanner;

class sample1{
    String name;

    int age;
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
    public void prime(int num) {
        for (int i = 1; i <= num; i++) {
            if (Math.sqrt(i) % 2 >= 1) {
                System.out.println(i + " is prime and " + Math.sqrt(i));
            }
            else {
                System.out.println(i + " is not prime " + Math.sqrt(i));
            }
        }

    }

}

public class tut19 {
    public static void main(String[] args) {
        sample1 sams = new sample1();
        sams.name = "shankar";
        sams.age=23;
        String names = sams.getName();
        System.out.println("The name is "+names);
        System.out.println("the age is "+sams.getAge());
        Scanner sc =new Scanner(System.in);
        float number = sc.nextFloat();
        System.out.println("enter the number to check prime:");
        int num  =sc.nextInt();
        sams.prime(num);





    }

}
