package john;

import java.util.Scanner;

class sample{
    public void getter(String name,int age){
        System.out.println("the Name is :"+name);
        System.out.println("The age is :"+age);
    }   
    int getHeight(int heights){
        return heights;
    }
}

public class tut20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name,age and height:");
        String name= sc.next();
        int age=sc.nextInt();
        int heights = sc.nextInt();

        sample sam = new sample();
        sam.getter(name,age);
        sam.getHeight(heights);
        System.out.println("The "+name+" height is "+heights);



    }

}
