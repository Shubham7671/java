package src.basics.Learning;

import java.util.Scanner;

/*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
 */

public class pattern {

    public static void asen(int n){
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");

        }
    }

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
           asen(i);
           System.out.println();
        }
        for(int i=num-1;i>=1;i--){
            asen(i);
            System.out.println();
        }
    }
}
