package src.basics.Learning.Recursion;

public class factorialOfNumber {
    static int calcFactorail(int n){
        if(n==0||n==1){
            return 1;
        }
        int fact=calcFactorail(n-1);
        int ans=n*fact;
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        int ans=calcFactorail(n);
        System.out.println(ans);
    }
}
