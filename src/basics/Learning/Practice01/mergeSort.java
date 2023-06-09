package src.basics.Learning.Practice01;

public class mergeSort {
    public static void main(String[] args) {
        int arr[]={4,9,5,6,2,1};

        mergeSorting(arr,0,arr.length-1);
    }
     static void mergeSorting(int []arr, int low,int high){
        if(low>=high){
            return;
        }
        int mid=(low+high)/2;
        // dividing
         mergeSorting(arr,low,mid-1);
         mergeSorting(arr,mid+1,high);
         conquer(arr,low,mid,high);
     }
     static void conquer(int []arr,int low,int mid,int high){
        int merged[]=new int[high-low+1];
        int index1=low;
        int index2=mid+1;
        int x=0;
        while (index1<=mid && index2 <=high){
            if(arr[index1]<=arr[index2]){
                merged[x++]=arr[index1++];
            }else{
                merged[x++]=arr[index2++];
            }
        }
        while (index1<=mid){
            merged[x++]=arr[index1++];
        }
        while (index2<=high){
            merged[x++]=arr[index2++];
        }
         for (int i = 0,j=low; i <merged.length ;j++, i++) {
             arr[j]=merged[i];
         }
     }
}
