package src.basics.Learning.Array;

import java.util.Scanner;

public class linearSearch {
    static int linear(int[]arr,int n,int k){
        for (int i = 0; i < n; i++) {
            if (arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int key= sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();

        }

        System.out.println(linear(arr,n,key));
    }
}
