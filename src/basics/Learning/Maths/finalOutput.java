package src.basics.Learning.Maths;
import java.util.*;

public class finalOutput {
    static long product(int arr[]){
        long product=1;
        long mod=1000000007;
        for(int i=0;i<arr.length;i++){
            product=((product%mod)*(arr[i]%mod))%mod;
        }
        return product;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(product(arr));
    }
}
