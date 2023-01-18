package src.basics.Learning.binarySearch;

import java.util.Scanner;

public class maxSubarraySum {


    // don't change the name of this class
        public static int maximumSum(int arr[], int n, int k)
        {

            int result=0;
            for (int i=0; i<k; i++){
                result += arr[i];
            }
            int curr= result;
            for (int i=k;i<n;i++)
            {
                curr+=arr[i]-arr[i-k];
                result= Math.max(result, curr);
            }
            return result;
        }
        public static void main (String[] args) {
            // Your code here
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int [n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            System.out.println(maximumSum(arr,n,k));





    }
}
