package DataStructures;
import java.util.Scanner;
import java.util.ArrayList;
public class newArrayL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> listing = new ArrayList<>();
        int d;
        for (int i = 0; i < n; i++) {
            listing.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                listing.get(i).add(sc.nextInt());
            }
        }
        System.out.println(listing);

        int q = sc.nextInt();
        for (int i = 1; i <= q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int ele;
            if (listing.size() >= x || listing.size() >= y) {
                ele = listing.get(x).get(y);
                System.out.println(ele);
            } else {
                System.out.println("Error");
            }
        }
    }
}

