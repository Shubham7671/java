package src.basics.Learning.Recursion;

public class sumOfDigits {
    static int sum(int n)
    {
        if (n == 0){
            return 0;
        }

        return (n % 10 + sum(n / 10));
    }
    public static void main(String[] args) {
        int num=1234;
        int ans=sum(num);
        System.out.println(ans);
    }
}
