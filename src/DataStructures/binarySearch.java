package DataStructures;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 5;
        int ans = search(arr,target);
        System.out.println(ans);

    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;



        while(start<=end){
            int mid = start+(end-start)/2;
            if(target < mid){
                end = mid -1;
            } else if (target>mid) {
                start = mid +1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
