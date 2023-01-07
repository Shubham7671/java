package src.basics.Learning.pattern;

import java.util.Scanner;

public class pattern06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row =sc.nextInt();
        int col= sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
