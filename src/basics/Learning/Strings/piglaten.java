package src.basics.Learning.Strings;

import java.util.Scanner;

public class piglaten {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String bag="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            char u=Character.toUpperCase(c);
           if(u=='A'||u=='E'||u=='I'||u=='O'||u=='U'){
               if(i==0){
                   bag+=str+"way";
               }else{
                   bag+=str.substring(i)+str.substring(0,i)+"wy";
                   break;
               }
           }
        }
        System.out.println(bag);
    }
}
