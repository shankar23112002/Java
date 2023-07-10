package john;

public class tut11 {
    public static void main(String[] args) {

        System.out.println("string in array");
        String[] words = new String[3];
        words[0] =  "hello";
        words[1] = "all";
        for (String word: words) {
            System.out.println(word);
        }
        words[2] = "how";
        System.out.println("another method for accessing elements in array");
        for (int i=0 ;i<=words.length;i++) {
            System.out.println(words[i]);
        }

        String text=null;
        System.out.println(text);

        String[] texts = new String[2];
        System.out.println(texts[0]);
        texts[1] = "one";

    }
}
