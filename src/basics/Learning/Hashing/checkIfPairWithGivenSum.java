package src.basics.Learning.Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class checkIfPairWithGivenSum {
    static void checkSum(int arr[],int sum){
        HashSet<Integer>mp=new HashSet<>();
        for(int i=0;i< arr.length;i++){
          if(mp.contains(sum-arr[i])){
              System.out.println("finded");
              return;
          }
          mp.add(arr[i]);
        }


        System.out.print("not finded");
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=7;
        checkSum(arr,sum);
    }
}
