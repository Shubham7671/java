package src.basics.Learning.binarySearch;

public class binarySearchDescending {
    static int binarySearchDes(int[]arr,int k){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(arr[mid]==k){
                return mid;
            } else if (arr[mid]<k) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={90,88,52,42,36,24,21,12,8,7,6,2,1,0};

        int ans=binarySearchDes(arr,21);
        System.out.println(ans);
    }
}
