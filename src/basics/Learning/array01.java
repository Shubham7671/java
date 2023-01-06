package src.basics.Learning;

import java.util.Scanner;

public class array01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int product=1;
        for(int i=n-1;i>=0;i--){
            if(i%2==0){
                sum+=arr[i];
            }
            if(i%2!=0){
                product=product*arr[i];
            }
//            System.out.println(arr[i]);
        }
        System.out.println(sum);
        System.out.println(product);
    }
}
