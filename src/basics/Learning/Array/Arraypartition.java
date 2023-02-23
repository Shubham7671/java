package src.basics.Learning.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arraypartition {
    public static void main(String[] args) {
        int []arr={1,4,3,2};
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i< arr.length-1;i=i+2){

            sum+=Math.min(arr[i],arr[i+1]);

        }
        System.out.println(sum);

    }
}
