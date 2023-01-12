package src.basics.Learning.Array;
import java.util.*;
public class missingNaturalNumber {
    static  int missing(int[]arr,int n){
        int k=1;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(k==arr[j]){
                    k++;
                }

            }
            break;

        }

        return k;
    }






    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(missing(arr,n-1));

    }
}
