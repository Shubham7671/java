package src.basics.Learning.Recursion;

public class fibonacciSeries {
    static void findfib(int a,int b,int n){
        if(n==0){
            return;
        }
        int sum=a+b;
        System.out.print(sum+" ");
        findfib(b,sum,n-1);


    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=7;
        System.out.print(a+" "+b+" ");
        findfib(a,b,n-2);

    }
}
