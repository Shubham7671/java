package src.basics.Learning.Recursion;

public class printNumNto1 {
    static void printnum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printnum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        printnum(n);
    }
}
