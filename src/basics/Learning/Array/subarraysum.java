package src.basics.Learning.Array;

public class subarraysum {

static void subarrayadd(int []arr,int a,int b){
    int sum=0;
 for(int i=a;i<=b;i++){
     sum+=arr[i];

 }
    System.out.println(sum);
}
    public static void main(String[] args) {
        int []arr= new int[] {1,3,4,5,6,7};
        subarrayadd(arr,2,5);
    }
}
