package src.basics.Learning.Strings;

import java.util.Scanner;

public class digitAndtheCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String bag="";
        String bag1="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if (Character.isDigit(c)) {
                bag+=c;
            }else{
                bag1+=c;
            }
        }
        System.out.println(bag+bag1);
    }
}
