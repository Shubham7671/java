package src.basics.Learning.Array;
import java.util.*;

public class MaxMin2darray {
    public static void main(String[] args) {
        int grid[][]={{1,2,3},
                {3,2,4}};
        int sum=0;
        for(int i=0;i<grid.length;i++) {
            Arrays.sort(grid[i]);
        }

        int max=0;
        for(int i=0;i<grid[0].length;i++) {
            max=0;
            for(int j=0;j<grid.length;j++) {
                max=Math.max(grid[j][i],max);
            }

            sum+=max;
        }

        System.out.println(sum);

    }
}
