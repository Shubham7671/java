package src.basics.Learning.Array;
import  java.util.*;

import java.lang.reflect.Array;

public class binarySearch {
    static  int binaryS(int []arr,int key){
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;


        for (; low<= high;) {
            int mid=(high+low)/2;

            if(arr[mid]==key){
                    return mid;
                }
            else if(arr[mid]<key){
                 low=mid+1;
                }
            else if(arr[mid]>key){
                high=mid-1;
            }

        }
 return -1;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int key=1;
        System.out.println( binaryS(arr,key));
    }
}
