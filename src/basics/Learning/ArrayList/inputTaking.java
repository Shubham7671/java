package src.basics.Learning.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class inputTaking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }



        System.out.println(al.get(0)+ al.get(1));
    }
}
