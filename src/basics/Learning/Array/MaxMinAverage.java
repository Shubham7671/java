package src.basics.Learning.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.*;

public class MaxMinAverage {
    public static void main(String[] args) {
        int arr[]={4,1,4,0,3,5};
        HashSet<Double> s=new HashSet<>();
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
           int a=arr[i];
           int b=arr[j];
           double avg=(a+b)/2;
           s.add(avg);
           i++;
           j--;
        }
        System.out.println(s.size());
    }
}
