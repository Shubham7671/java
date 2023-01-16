package src.basics.Learning.binarySearch;

public class firstOccurrence {
    static int firstOccur(int arr[],int k)
    {
        int start=0;
        int end= arr.length-1;
        int ans=0;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==k){
                 ans=mid;
                end=mid-1;
            } else if (arr[mid]<k) {
                start=mid+1;

            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,7,7,7,7,7,7,8,9};
         int res=firstOccur(arr,7);
        System.out.println(res);
    }
}
