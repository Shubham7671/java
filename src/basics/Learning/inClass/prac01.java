package src.basics.Learning.inClass;

import java.util.ArrayList;

public class prac01 {
    public static void main(String[] args) {
//        ArrayList<String>al=new ArrayList<>();
        String str="abcf l  jjj jjj ";
         String s[]= str.split(" ");
        for (int i= s.length-1;i>=0;i--){
            System.out.println(s[i]);
        }
    }
}
