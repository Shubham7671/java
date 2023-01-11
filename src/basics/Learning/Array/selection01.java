package src.basics.Learning.Array;
import java.util.Scanner;
public class selection01 {
    static  void selectionAsen(int []arr,int n){
        for (int i = 0; i < n-1; i++) {
            int min=i;
            for (int j =1+i; j <n ; j++) {
                if(arr[i]>arr[j]){
                    min=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        selectionAsen(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }

    }
}
