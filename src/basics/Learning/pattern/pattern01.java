package src.basics.Learning.pattern;

import java.util.Scanner;
import java.util.StringJoiner;



     /* * * * * * * *
        * * * * * * *
        * * * * * * *
        * * * * * * *
        * * * * * * *    */



public class pattern01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
