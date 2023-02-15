package src.basics.Learning.Strings;

import java.util.Scanner;

public class convertCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
         String bag="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if (Character.isUpperCase(c)) {
                bag+=  Character.toLowerCase(c);
            }else{
             bag+=  Character.toUpperCase(c);
            }
        }
        System.out.println(bag);
    }
}
