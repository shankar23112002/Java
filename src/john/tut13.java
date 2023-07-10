package john;

import java.util.Scanner;

class person{
    String name;
    int age;
}


public class tut13 {
    public static void main(String[] args) {
        System.out.println("Intro to class");
        System.out.println("Class 1");
        person person1 = new person();
        person1.name = "Shankar";
        person1.age = 20;
        System.out.println("Name : "+person1.name);
        System.out.println("age is : " +person1.age);

        System.out.println("Class 2");
        person person2 = new person();
        person2.name = "john";
        person2.age = 7;
        System.out.println("Name : "+person2.name);
        System.out.println("age is : " +person2.age);

        System.out.println("class 3 with scanning function");
        Scanner sc = new Scanner(System.in);
        person person3 = new person();
        person3.name = sc.next();
        person3.age = sc.nextInt();
        System.out.println("Name : "+person3.name);
        System.out.println("age is : " +person3.age);
    }
}
