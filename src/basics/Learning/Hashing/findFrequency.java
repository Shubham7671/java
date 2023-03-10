package src.basics.Learning.Hashing;

import java.util.HashMap;

public class findFrequency {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,5,5};
        int sum=6;
        HashMap<Integer,Integer> mp=new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
           if(!mp.containsKey(arr1[i])){
               mp.put(arr1[i],1);
           }else{
               mp.put(arr1[i],mp.get(arr1[i])+1);

           }
        }
        System.out.println(mp);


    }
}
