package DataStructures;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int [] a = {12,32,13,34,-7,61,57,48,9,10};
        int target = 9 ;
        int ans = lsearch(a,target);
        System.out.println(target+" is found in index of "+ans);
        int start = 0;
        int end = 8;
        int range = lsearch2(a,target,start,end);
        if(range == -1){
            System.out.println(target+" is not found between "+start +" and "+ end);
        }
        else {
            System.out.println(target+" is found between "+start +" and "+ end);
        }
        int minva = min(a);
        System.out.println("The minimum value in the array is "+minva);
        int maxva = max(a);
        System.out.println("The maximum value in the array is "+maxva);

        int [] evenArr = even(a);
        System.out.println("Elements that are even numbers in array :");
        System.out.println(Arrays.toString(evenArr));
    }
    static int lsearch(int[] a,int target){
        if(a.length==0){ //return -1 if there is no element in array
            return -1;
        }
        for (int index = 0; index < a.length; index++) { //compares each element in array with the target value
            if(a[index] == target){
                return index;
            }
        }
        return -1;//return -1 if the value is not found
    }
    static int lsearch2(int[] a,int target,int start , int end){//Seatch the value in specific index
        if(a.length==0){
            return -1;
        }
        for(;start<=end;start++){
            if(a[start] == target){
                return start;
            }
        }
        return -1;
    }

    //Assume array a.length!=0
    static int min(int [] a){ //Find and return the minimum value in the array
        int minv = a[0];
        for (int i:a) {
            if(minv > i){
                minv = i;
            }
        }
        return minv;
    }
    static int max(int [] a){ //Find and return the maximum value in the array
        int maxv = a[0];
        for (int i:a) {
            if(maxv < i){
                maxv = i;
            }
        }
        return maxv;
    }

    static int[] even(int [] a){
        int count = 0;

        for (int j : a) {
            if (j % 2 == 0) {
                count++;
                //arr[i] = a[i];
            }
        }
        int[] arr=new int[count];
        int co =0 ;
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 ==0){
                arr[co] = a[i];
                co++;
            }
        }
        return arr;
    }
}
