package src.basics.Learning.Strings;

import java.util.Scanner;

public class patternSearching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String k=sc.next();

        //------------------ if you want to find just word is present or not-------------

//        if(str.contains(k)){
//            System.out.println("yes");
//        }else{
//            System.out.println("no");
//        }

        // ------------------if you want to find index of element---------------------

        if(str.indexOf(k)==-1){
            System.out.println("Not found");
         }else{
           System.out.println(str.indexOf(k));
         }
    }
}
