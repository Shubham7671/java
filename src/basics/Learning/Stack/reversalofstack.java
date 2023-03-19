package src.basics.Learning.Stack;

import java.util.Stack;

public class reversalofstack {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Stack<Integer> st=new Stack<>();
        Stack<Integer> ansSt=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            ansSt.push(st.pop());
        }
        while(!ansSt.isEmpty()){
            System.out.println(ansSt.pop());
        }

    }
}
