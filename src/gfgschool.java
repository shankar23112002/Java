import java.util.Scanner;
class task
{
    int le,we,he;
    public void set_length(int l)
    {
        this.le =l;
    }
    public void set_width(int w)
    {
        this.we = w;
    }
    public void set_height(int h)
    {
        this.he = h;
    }
    public void volume()
    {

        System.out.println(le*we*he);
    }
}

public class gfgschool {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        task ob = new task();
        ob.set_length(l);
        ob.set_width(w);
        ob.set_height(h);
        ob.volume();
    }


}
