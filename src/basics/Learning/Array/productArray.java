package src.basics.Learning.Array;

public class productArray {
    static int productAray(int[]arr){
        int product=1;
        for(int i=0;i<arr.length;i++){
            product=product*arr[i];
        }
        return product;
    }
    public static void main(String[] args) {
  int []arr= new int[] {1,2,3,4};
        System.out.println(productAray(arr));
    }
}
