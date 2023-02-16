package src.basics.Learning.Strings;

import java.util.Scanner;

public class longestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str+" ";
        String bag="";
        String min="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c!=' '){
               bag+=c;
            }else{
                if(bag.length()>min.length()){
                    min=bag;
                }


                bag="";
            }
        }
        System.out.println(min);
    }
}
