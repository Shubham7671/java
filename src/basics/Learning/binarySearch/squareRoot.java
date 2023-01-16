package src.basics.Learning.binarySearch;

public class squareRoot {
    static int square(int []arr,int n){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]*arr[mid]==n){

                return arr[mid];
            }
            else if(arr[mid]*arr[mid]<n){
                ans=arr[mid];
                start=mid+1;
            }else{

                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,10,16,40};
        int key=5;
        int res=square(arr,key);
        System.out.println(res);
    }
}
