package src.basics.Learning.Array;

import java.util.Scanner;

public class array01 {
    static int sumarray(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
    return  sum;
    }
    public static void main(String[] args) {

        int []arr= new int[] {1,2,3,4};
        System.out.println(sumarray(arr));

    }
}
