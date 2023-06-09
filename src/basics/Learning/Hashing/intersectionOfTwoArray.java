package src.basics.Learning.Hashing;

import java.util.HashSet;

public class intersectionOfTwoArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,5,5};
        int arr2[]={2,9,10,5,5};
        HashSet<Integer>mp=new HashSet<>();
        for(int i=0;i<arr1.length;i++){ //1  3 4
            mp.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(mp.contains(arr2[i])){ // 2 5
                System.out.println(arr2[i]);
                mp.remove(arr2[i]);
            }
        }
    }
}
