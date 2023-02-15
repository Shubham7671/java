package src.basics.Learning.Strings;

import java.util.Scanner;

public class plus2toCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String bag="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
           if(c=='y'||c=='z'||c=='Y'||c=='Z') {
               c -= 26;
           }
               c+=2;
               bag+=c;

        }
        System.out.print(bag);
    }
}
