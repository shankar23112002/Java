public class BasicFunction {
    static  int y = 12;//Declare and initialize the variable y

    public static void main(String[] args) {
        int x =10;//declare and initialize the variable x
        System.out.println(x);
        y = 14;//modify the y
        System.out.println(y);
        {
            x =20;//modify the x
            System.out.println(x);
            fun();//call teh fun
            int ans = fun1(1,2);
            System.out.println(ans);
        }
    }
    static void fun(){
        y =13;//Again modify the y
        System.out.println(y);
    }
    static int fun1(int a,int b){//function has the parameters
        if(a+b > 0){
            return a+b;
        }
        return a-b;
    }
}
