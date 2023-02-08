package src.basics.Learning.Recursion;

public class sumOfNaturalNumbers {
    static void printSum(int n ,int sum){
        if(n==0){
            System.out.println(sum);
            return ;
        }

        sum=sum+n;
        printSum(n-1,sum);



    }
    public static void main(String[] args) {
        int n=5;
        int sum=0;
       printSum(n,sum);

    }
}
