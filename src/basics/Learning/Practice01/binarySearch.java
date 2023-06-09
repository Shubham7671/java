package src.basics.Learning.Practice01;

public class binarySearch {
    public static void main(String[] args) {
        int arr[]= {1, 2, 3, 4, 5};
        int el=5;
        int ans= binarySearch(arr, 2);
    }
    static int binarySearch(int []arr,int el){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[start]==el){
                return mid;
            }
            else if(arr[mid]>el){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
       return -1;
    }
}
