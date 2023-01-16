package src.basics.Learning.binarySearch;

public class lastOccur {
    static int lastOccu(int arr[],int k){
        int start=0;
        int end= arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==k){
                ans=mid;
                start=mid+1;
            } else if (arr[mid]<k) {
                start=mid+1;

            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,6,6,6,6,6,6,6,6,6,6};
        int res=lastOccu(arr,6);
        System.out.println(res);
    }
}
