package src.basics.Learning.Strings;

import java.util.Scanner;

public class printWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str+ " "; // my name is sshubham
        String bag="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(' ' !=c){
              bag+=c; // my
            }else{
                System.out.println(bag+" ");
                bag="";
            }
        }
    }
}
