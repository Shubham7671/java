package src.basics.Learning.Stack;

import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class removeAdajacentpair {

        public static void main(String[] args) {

            String str = "aaaazbc";
            System.out.println(removeDuplicates(str));
        }

        private static String removeDuplicates(String str) {

            Stack<Character> s = new Stack<>();

            for (int i = 0; i < str.length(); i++) {
                if (!s.isEmpty() && s.peek() == str.charAt(i)) {
                    s.pop();
                } else {
                    s.push(str.charAt(i));
                }
            }
            System.out.println(s);
            String bag = "";

            for (int j = 0; j < s.size(); j++) {
                bag += s.get(j);
            }

            return bag;
        }
    }

