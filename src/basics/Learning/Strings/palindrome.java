package src.basics.Learning.Strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
    String rev="";
        for(int i=str.length()-1;i>=0;i--){
            char c=str.charAt(i);
            rev+=c;
        }
        System.out.println(str.equalsIgnoreCase(rev));
        System.out.print(rev);
    }
}
