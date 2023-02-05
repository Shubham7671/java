package src.basics.Learning.examples;
import  java.util.*;
public class doremonAndBiglight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();//bigger given
        int h2 = sc.nextInt();//smaller given
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        if(v1>=v2) System.out.println("false");
        else{
            while(h1>=h2){
                h1+=v1;
                h2+=v2;
                if(h1==h2) break;
            }
            System.out.println(h1==h2);
        }
    }
}
