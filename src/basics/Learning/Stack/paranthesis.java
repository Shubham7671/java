package src.basics.Learning.Stack;

import java.util.Stack;

public class paranthesis {
    public static void main(String[] args) {
        String s="}";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='['){

                st.push(s.charAt(i));

            } else if (s.charAt(i) == ')' && !st.isEmpty() && st.peek() == '('){

                st.pop();

            }else if (s.charAt(i)=='}'&&!st.isEmpty()&&st.peek()=='{'){

                st.pop();

            }else if (s.charAt(i)==']'&&!st.isEmpty()&&st.peek()=='['){

                st.pop();

            }else {

                System.out.print("False");

                return;

            }

        }

        System.out.print(st.isEmpty());
    }
}
