package src.basics.Learning.practice;

public class p01 {
public static void main(String[] args) {
         int nums[]={7,1,2,1,2,5,5,9};
        int ans=0;
        for(int i=0; i<nums.length; i++) {
            ans ^= nums[i];
        }
    System.out.println(ans+"    ");
}



}
