package src.basics.Learning.Array;

import java.util.Scanner;

public class highestFrequencyElement {
    public static void main (String[] args) {
int arr[]={4,5,5,5,4,4};
int pre_count=0;
int el=0;
int prev_el=0;

        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }

            if(count>=pre_count){
                pre_count=count;
                el=arr[i];
                if(el>prev_el){
                    prev_el=el;
                }
            }


        }





        System.out.println(prev_el);


    }

}
