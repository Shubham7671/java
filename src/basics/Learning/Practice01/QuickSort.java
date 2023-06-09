package src.basics.Learning.Practice01;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        int arr[]={1,7,2,6,4,1,6};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static void quickSort(int arr[],int low,int high){
        if(low<high) {
            int pivotIndex = partion(arr, low, high); // correct index of a element
            // recursive method
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }
    static  int partion(int arr[],int low,int high){
        int pivot=arr[high]; // last element as pivot
        int i=low-1; // to make space for correct index

        for (int j = low; j<high; j++) {
            if (arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
            i++;
            int temp=arr[i];
            arr[i]=pivot;
            arr[high]=temp;

        return i; // pivot index
    }
}
