package src.basics.Learning.Array;
import  java.util.Scanner;
public class mapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N =sc.nextInt();
        int []arr=new int[N];

        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<N;i++){
            int count=-1;
            for(int j=i;j<N;j++){
                if(arr[j]%arr[i]==0){
                    count++;
                }
            }

            System.out.println(count);
        }

    }
}
