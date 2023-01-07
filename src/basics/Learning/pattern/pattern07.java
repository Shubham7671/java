package src.basics.Learning.pattern;

import java.util.Scanner;

public class pattern07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int k=1;
        for(int i=1;i<=row;i++){
            for (int j=1;j<=i;j++){
                System.out.print(k+++" ");
            }
            System.out.println();
        }
    }
}
