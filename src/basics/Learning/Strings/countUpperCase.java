package src.basics.Learning.Strings;

import java.util.Scanner;

public class countUpperCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
