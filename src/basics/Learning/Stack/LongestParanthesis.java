package src.basics.Learning.Stack;

import java.util.Stack;

public class LongestParanthesis {


    public static void main(String[] args) {
        String strr=")()())";
        char [] str=strr.toCharArray();
        Stack<Character> s=new Stack<>();
        Stack<Integer> i=new Stack<>();
        i.add(-1);
         int max=0;
        for (int j = 0; j <str.length ; j++) {
            if(str[j]=='('){
                s.add('(');
                i.add(j);
            }else{
                if(!s.isEmpty() && s.peek()=='('){
                    s.pop();
                    i.pop();
                    max=Math.max(max,j-i.peek());
                }else {
                    i.add(j);
                }
            }
        }
        System.out.println(max);
    }
}
