package src.basics.Learning.examples;
import java.util.*;
public class McqExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        int S = sc.nextInt();
        int T = (P + Q + R + S);
        int A  = Math.max(Math.max(Math.max(P,Q),R),S);
        if (T==100);
        System.out.println(A);



    }
}
