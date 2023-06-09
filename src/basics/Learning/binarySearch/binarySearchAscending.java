package src.basics.Learning.binarySearch;

public class binarySearchAscending {
    static int binaryAsen(int[]arr,int k){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if (arr[mid]<k){
            start=mid+1;
                }
            else {
                end=mid-1;
            }
        }
        return -1;
        }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,14,75,89,};

        int ans=binaryAsen(arr,5);
        System.out.println(ans);

    }
}
