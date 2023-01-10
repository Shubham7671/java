package src.basics.Learning.Array;
import  java.util.Scanner;
public class swaparray {

    static void swaparay(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }

    }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        swaparay(arr);
        int sum=0;
        long product=1;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                sum+=arr[i];
            }
            if(i%2==0){
                product*=arr[i];
            }
        }
        System.out.println(sum+" "+product);
    }
}
