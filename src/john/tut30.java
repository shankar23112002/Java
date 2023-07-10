package john;

public class tut30 {
    public static void main(String[] args) {
        int num = 199;
        int rem = 0;
        while (num > 0) {
            rem += num % 10;
            num /= 10;
        }
        if (rem >= 10) {
            while (rem > 0) {
                num += rem % 10;
                rem /= 10;
            }
            System.out.println(num);
        }
        do {
            while (num > 0) {
                rem += num % 10;
                num /= 10;
            }

            System.out.println(rem);
        }while (num >= 10) ;
    }
    }