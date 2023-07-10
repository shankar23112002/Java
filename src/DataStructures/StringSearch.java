package DataStructures;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Shankar";
        char target = 'p';
        System.out.println(strSearch(name,target));
    }
    static boolean strSearch(String name,char target){
        if(name.length()==0){ //return false whether the string length is 0
            return false;
        }
        for (int i = 0; i < name.length(); i++) { //compares the string with target value
            if(target == name.charAt(i)){
                return true;
            }
        }
        int co = 0;
        for(char cha : name.toCharArray()){ //Enhanced for loop is used for to find a character
            System.out.print(cha);
            if(cha == 'a'){
                co++;
            }
        }
        System.out.println();
        System.out.println("a found "+ co+" times in "+name );
        return false;//return false else it can't find the target value
    }
}
