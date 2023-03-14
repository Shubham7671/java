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
        int n=41;
        System.out.print(a+" "+b+" ");
        findfib(a,b,n-2);
//        int sum=0;
//        for(int i=2;i<=n;i++){
//            sum=a+b;
//            a=b;
//            b=sum;
//        }
//        System.out.println(sum);

    }
}
