package DataStructures;

//import java.util.Arrays;

//find all even number of digits eg:12- even digits , 1243-even digit ,3-one digit,654-odd dogit
public class evenDigit {
    public static void main(String[] args) {
        int [] nums ={1,32,12,231,2345};
        System.out.println(findNUm(nums));

    }

    static int findNUm(int[] nums){
        int count =0;
        for (int num:nums ) {
            if(evendi(num)){
                count++;
            }
        }
        return count;

    }

    //function to check whether even digit or not
    static boolean evendi(int num) {
        int numOfDigit = digits(num);
        return numOfDigit%2==0;
    }

    //count  number of digits in a number
    static int digits(int num){
        int count =0 ;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}
