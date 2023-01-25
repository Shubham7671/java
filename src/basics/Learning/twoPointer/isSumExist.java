package src.basics.Learning.twoPointer;

public class isSumExist {
    static boolean sumexistss(int []arr,int k){
        int i=0;
        int j= arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==k){
                return true;
            } else if (arr[i]+arr[j]<k) {
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,7,10};
        int sum=11;

        System.out.println(sumexistss(arr,sum));




    }
}
