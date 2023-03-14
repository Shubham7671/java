package src.basics.Learning.practice;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p02 {
    public static void main(String[] args) {
//        int arr[]={3,3,3,2,2,1,1,0,0,6,7,5,6,4,6,5,4,6,4,5,8,1,8,4,8,5,5,55,5,1,16,664,66,46,46};
//        int arr[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        TreeMap<Integer,Integer> mp=new TreeMap<>();

        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1 );
            }else{
                mp.put(arr[i],1 );
            }
        }

        boolean is=true;
       for(Map.Entry<Integer,Integer> e:mp.entrySet()){
           if(e.getValue()>1){
               is =false;
               System.out.print(e.getKey()+" ");
           }
       }

         if(is){
      System.out.println(-1);
       }
    }
}
