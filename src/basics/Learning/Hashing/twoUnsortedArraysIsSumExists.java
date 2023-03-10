package src.basics.Learning.Hashing;

import java.util.HashSet;

public class twoUnsortedArraysIsSumExists {
    static void findPairs(int arr1[],int arr2[],int sum){
        HashSet<Integer>mp=new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            mp.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(mp.contains(sum-arr2[i])){
                System.out.println((sum-arr2[i])+" "+arr2[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr1[]={1, 2, 4, 5, 7};
        int arr2[]={5, 6, 3, 4, 8} ;
        int sum=9;
        findPairs(arr1,arr2,sum);
    }
}
