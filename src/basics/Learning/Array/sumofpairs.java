package src.basics.Learning.Array;

import java.util.Scanner;

public class sumofpairs {
    static int sum(int a,int b){
      return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(sum(arr[i],arr[i+1])+" ");
            i++;
        }
    }
}
