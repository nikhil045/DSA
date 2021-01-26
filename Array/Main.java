// package Array;
// import java.util.ArrayList;
// import java.lang.Integer;


class Main{
    public static void main(String args[]){

        // ArrayList<Integer> arr = new ArrayList<Integer>;
        int arr[] = new int[3];
        arr[0] = 1;
        arr[2] = 2;
        arr[1] = 3;
        print(arr);

    }
    public static void print(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}