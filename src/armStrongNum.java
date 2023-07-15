public class armStrongNum {
    public static void main(String[] args) {
        int n = 153;
        int ans = fun(n);
        if(ans  == n){
            System.out.println("armstrong number..");
        }else {
            System.out.println("not");
        }

    }
    static int fun(int n){
        int re =0;
        while(n>0){
            int r = n %10;
            re += Math.pow(r,3);

            n /=10;

        }
        return re;
    }
}

