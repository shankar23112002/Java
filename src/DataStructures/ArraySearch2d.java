package DataStructures;

import java.util.Arrays;

public class ArraySearch2d {
    public static void main(String[] args) {
        int[][] mdArray = {
                {1,2,3},
                {4,5,},
                {6,7,8}
        };
        int target = 5;
        int[] ans = search(mdArray,target);
        System.out.print("Element found in the index of ");
        System.out.print(Arrays.toString(ans));

        System.out.println();
        int maxe = max(mdArray);
        System.out.println("The maximum element in this 2d array is "+maxe);

        int mini = min(mdArray);
        System.out.println("The minimum element in this 2d array is "+mini);
    }
    static int[] search(int[][] mdArray,int target){

        for (int row = 0; row < mdArray.length; row++) {
            for(int col = 0;col<mdArray[row].length;col++){
                if(target == mdArray[row][col]){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }

    static int max(int[][] mdArray){
        int max = mdArray[0][0];
        for (int row = 0; row < mdArray.length; row++) {
            for(int col = 0;col<mdArray[row].length;col++){
                if(max < mdArray[row][col]){
                    max = mdArray[row][col];
                }
            }
        }
        return max;
    }

    static int min(int[][] mdArray){
        int min = mdArray[0][0];
        for (int row = 0; row < mdArray.length; row++) {
            for(int col = 0;col<mdArray[row].length;col++){
                if(min > mdArray[row][col]){
                    min = mdArray[row][col];
                }
            }
        }
        return min;
    }
}
