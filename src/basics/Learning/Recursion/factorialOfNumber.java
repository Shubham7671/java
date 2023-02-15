package src.basics.Learning.Recursion;

public class factorialOfNumber {
    static int calcFactorial(int n){
        if(n==0||n==1){
            return 1;
        }
        int fact=calcFactorial(n-1);
        int ans=n*fact;
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        int ans=calcFactorial(n);
        System.out.println(ans);
    }
}
