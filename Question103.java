// 20. Valid Parentheses

import java.util.Scanner;
import java.util.Stack;

public class Question103 {

    public static boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else{
                    if((ch ==')' && st.peek() == '(') ||
                       (ch ==']' && st.peek() == '[') ||
                       (ch =='}' && st.peek() == '{')){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean ans = isValid(str);
        System.out.println(ans);
        sc.close();
    }
}
