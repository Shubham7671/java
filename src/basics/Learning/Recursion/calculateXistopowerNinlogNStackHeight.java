package src.basics.Learning.Recursion;

public class calculateXistopowerNinlogNStackHeight {
    static int calculateXIsToPower(int x,int n){
       if(n==0){
           return 1;
       }
       if(x==0){
           return 0;
       }
       if (n%2==0){
           return calculateXIsToPower(x,n/2)* calculateXIsToPower(x,n/2);
       }else{
           return calculateXIsToPower(x,n/2)*calculateXIsToPower(x,n/2)*x;
       }
    }
    public static void main(String[] args) {
        int x=3;
        int n=3;
        int ans=calculateXIsToPower(x,n);
        System.out.println(ans);
    }
}
