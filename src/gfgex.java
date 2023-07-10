import java.util.ArrayList;

public class gfgex {
    public static void main(String[] args) {
        int [] v1 = {1,2,3,4,5};
        int[] v2 = {1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<v1.length;i++){
            for(int j=0;j<v2.length;j++){
                if(v1[i]==v2[j]){
                    ans.add(v1[i]);
                }
            }
        }
    }
}
