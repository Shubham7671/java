package src.basics.Learning.binarySearch;

public class ceilValue {
    static int ceilVal(int[]arr,int key){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return arr[mid];
            } else if (arr[mid]<key) {
                start=mid+1;
            }else{
                ans=arr[mid];
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,7,8,10,40,50,60,};
        int key=4;
        int res=ceilVal(arr,key);
        System.out.println(res);
    }
}
