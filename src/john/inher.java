package john;

public class inher {
    //inherotance botany biology and zoology
    public static void main(String[] args) {

        System.out.println("Single Inheritance: Access the biology class(class A) from inher class (class B)..");
        biology bio = new biology();
        bio.bioClass();

        System.out.println("Multilevel Inheritance : Access the botany class(class B and botany extends biology(A)) from inher(C) ");
        botany bot = new botany();
        bot.BotRoom();
        bot.bioClass();
        System.out.println("Superclass of this class is "+bot.getClass().getSuperclass().getName());

        System.out.println("Hierarchical Inheritance : Both zoology and botany inherits the biology");
        zoology zoo = new zoology();
        zoo.bioClass();
        zoo.zooClass();


    }
}
