package src.basics.Learning.Hashing;

import java.util.HashMap;

public class subsetOfAnotherArray {
    static boolean check(int arr1[],int arr2[]){
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr1.length;i++) {
            mp.put(arr1[i], 0);
        }
        for (int i=0;i<arr2.length;i++){
             if(!mp.containsKey(arr2[i])){
                 return false;
             }
        }

      return true;
    }
    public static void main(String[] args) {
        int arr1[]={11, 1, 13, 21, 3, 7 };
        int arr2[]={11, 3, 7, 1,9};
        System.out.println(check(arr1,arr2));
    }
}
