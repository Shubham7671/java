package src.basics.Learning.Maths;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    static boolean[] isPrime(int n,boolean []arr){

        Arrays.fill(arr,true);
   arr[0]=false;
   arr[1]=false;
   for(int i=2;i*i<=n;i++){
       for(int j=2*i;j<=n;j=j+i){
           arr[j]=false;
       }
   }


        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean[]arr=new boolean[n+1];
        isPrime(n,arr);
        int count =0;
        for (int i = 0; i <= n; i++) {
            if(arr[i]==true){
                count++;
            }
        }

        System.out.println(count);
    }
}
