package src.basics.Learning.binarySearch;

import java.util.Scanner;

public class TwoCubes {
    static boolean TwoCubes(int n)
    {
        int low= 1,high=(int)Math.cbrt(n);
        while (low<=high) {
            int current = (low*low*low+high*high*high);
            if(current==n)
                return true;
            if(current<n)
                low++;

            else
                high--;
        }

        return false;
    }
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if (TwoCubes(N)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
