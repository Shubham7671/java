package src.basics.Learning.Recursion;

public class stairCase {
    public static int climbStairs(int n) {

        if (n <= 1) return 1;

        return (climbStairs(n - 1) + climbStairs(n - 2));
    }
    public static void main(String[] args) {
       int n=2;
       int ans=climbStairs(n);
        System.out.println(ans);
    }
}
