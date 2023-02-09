package src.basics.Learning.Recursion;

public class calculateXIsToPowerN {
    static int calculateXAndN(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int nth=calculateXAndN(x,n-1);
        int ans=x*nth;
        return ans;
    }
    public static void main(String[] args) {
        int n=3;
        int x=3;
        int ans=calculateXAndN(x,n);
        System.out.println(ans);
    }
}
