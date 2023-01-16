package src.basics.Learning.binarySearch;

public class countNumberOfOccurrence {
    static int countNumber(int[]arr,int k){
        int start=0;
        int end= arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==k){
                ans=mid;
               end=mid-1;
            } else if (arr[mid]<k) {
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return ans;
    }
    static int countNumber2(int[]arr,int k){
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
            }else {
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,5,5,5,5,5,6,7,8,9,9};
        int res= countNumber2(arr,10)-countNumber(arr,10)+1;
        System.out.println(res);
    }
}
