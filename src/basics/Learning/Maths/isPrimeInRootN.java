package src.basics.Learning.Maths;

import java.util.Scanner;

public class isPrimeInRootN {
    static boolean countPrime(int num){
        if(num==1){
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- !=0){
            int n=sc.nextInt();
            int count=0;
            for(int i=1;i<=n;i++){
                if(countPrime(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
