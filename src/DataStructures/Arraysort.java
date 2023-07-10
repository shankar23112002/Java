package DataStructures;

public class Arraysort {
    public static void main(String[] args) {
        int[] arr = {31,2 ,12,84,55,1};

        //int start = arr[0];
        for (int j=0;j<arr.length-1;j++){
        for(int i =0 ;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }}
        for (int a:arr) {
            System.out.println(a);
        }
    }
}
