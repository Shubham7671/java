package src.basics.Learning.Recursion;

public class returnSumOfNumbers {
    static int calculateSum(int n){
       if(n==0){
           return 0;
       }
       int sum_num=calculateSum(n-1);
        System.out.println(sum_num);
        int sum=n+sum_num;
       return sum;

    }
    public static void main(String[] args) {
      int n=6;
      int sum=0;
      int ans=calculateSum(n);
        System.out.println(ans);
    }
}
