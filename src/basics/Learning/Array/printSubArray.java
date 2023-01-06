package src.basics.Learning.Array;

public class printSubArray {

static void psubArray(int[] arr,int a,int b){
  for(int i=a;i<=b;i++){
      System.out.println(arr[i]);
  }

}
    public static void main(String[] args) {
        int []arr= new int[] {1,2,3,4,5,6,7};
        psubArray(arr,3,6);
    }
}
