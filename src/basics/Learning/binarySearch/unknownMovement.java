package src.basics.Learning.binarySearch;

public class unknownMovement {
    static int unknownMove(int[]arr,int k) {
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[0]<arr[1]){
                if(arr[mid]==k){
                    return mid;
                }
                else if(arr[mid]<k){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
           else{
                if(arr[mid]==k){
                    return mid;
                }
                else if(arr[mid]<k){
                    end=mid-1;

                }else{
                   start=mid+1;
                }

            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={2,5,7,8,9,11,13,15};
        int arr1[]={50,49,45,24,16,14,8,7,6,3,2,1,0};

        int asen=unknownMove(arr,13);
        int dsen=unknownMove(arr1,0);
        System.out.println(asen);
        System.out.println(dsen);
    }
}
