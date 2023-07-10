package john;

class student{
        public String name ;//name is non-static variable or instance variable
        public static int age;//age is static variable

        public void stuInfo(){
            System.out.println("Student information "+name+" "+age);//static variable age can access by the normal instance method
            //but the normal instance variable is cannot access by the static method
        }

        public static void person(){
            System.out.println("age in static method "+age);
        }
}
public class tut23 {
    public static void main(String[] args) {

        student.age = 23;
        student.person();

        student stu = new student();

        stu.name = "hari";
        stu.stuInfo();

        System.out.println(stu.name);
    }
}
