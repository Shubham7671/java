package src.basics.Learning.Strings;

import java.util.Scanner;

public class printWordStartsWithKey {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str+" "; // my name is shubham
        String bag="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c!=' '){
                bag+=c; //my
            }else{
                if(bag.charAt(0)=='s'){
                    System.out.println(bag);
                }
                bag="";
            }
        }
    }
}
