package src.basics.Learning.examples;

import java.util.*;

public class RemaingHunger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer>st=new Stack<>();
        int n=sc.nextInt();
        int stu[]=new int[n];
        int para[]=new int[n];
        int p0=0;
        int p1=0;
        for(int i=0;i<n;i++){
            stu[i]=sc.nextInt();
            if(stu[i]==0)
                p0++;// adding students who need 0 size paratha;
            if (stu[i]==1)
                p1++;// adding students who need 1 size paratha;
        }
        for (int i = 0; i < n; i++) {
            para[i]= sc.nextInt();
        }
        for (int i = n-1; i>= 0; i--) {
             st.add(para[i]);
        }
        for (int i = 0; i < n; i++) {

            if(st.peek()==0){
                if(p0==0){
                    break;
                }
               p0--;
               st.pop();
            }
            if(para[i]==1){
                if(p1==0){
                    break;
                }
                p1--;
                st.pop();
            }

        }
        System.out.println(st.size());

    }
}
