package src.basics.Learning.Strings;

import java.util.Scanner;

public class firstCharacterOfWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str+" ";
        String bag="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c!=' '){
               bag+=c;
            }else{
                System.out.println(bag.charAt(0));

                bag="";
            }
        }
    }
}
