package src.basics.Learning.Strings;

import java.util.Scanner;

public class rotatedornot {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.next();
        String str="rellnmpapqfwkhop";
        String str2="llnmpapqfwkhopre";
        char c=str.charAt(0);
        char d=str.charAt(1);

        String bag="";
        for(int i=2;i<str.length();i++){
            bag+=str.charAt(i);
        }
        bag=bag+c+d;
//        System.out.print(bag+c+d);
        System.out.println(bag.equals(str2));
    }
}
