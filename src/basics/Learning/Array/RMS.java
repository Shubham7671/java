package src.basics.Learning.Array;
import  java.util.Scanner;
public class RMS {
    static void square(int []arr,int n){
        for(int i=0;i<n;i++){
            arr[i]=arr[i]*arr[i];
        }
    }
    public static void main (String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        square(arr,n);
        double sum=0.0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        double mean=Math.sqrt(sum/n);
        String str = String.format("%.6f", mean );
        System.out.println(str);
    }
}
