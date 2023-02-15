package src.basics.Learning.Recursion;

public class findMax {
    public static int findMax(int[] arr, int i) {
        if (i > 0) {
            return Math.max(arr[i], findMax(arr, i-1));
        } else {
            return arr[0];
        }
    }
    public static void main(String[] args) {
       int arr[]={1,2,3,4};
       int ans=findMax(arr, arr.length-1);
        System.out.println(ans);

    }
}
