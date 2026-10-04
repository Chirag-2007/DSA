// 150. Evaluate Reverse Polish Notation

import java.util.Scanner;
import java.util.Stack;

public class Question106 {

    public static int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            if(tokens[i].equals("+")){
                int b = st.pop();
                int a = st.pop();
                st.push(a + b);
            }
            else if(tokens[i].equals("-")){
                int b = st.pop();
                int a = st.pop();
                st.push(a - b);
            }
            else if(tokens[i].equals("*")){
                int b = st.pop();
                int a = st.pop();
                st.push(a * b);
            }
            else if(tokens[i].equals("/")){
                int b = st.pop();
                int a = st.pop();
                st.push(a / b);
            }
            else{
                int num = Integer.parseInt(tokens[i]);
                st.push(num);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] tokens = new String[n];
        for(int i = 0; i < n; i++){
            tokens[i] = sc.next();
        }
        int ans = evalRPN(tokens);
        System.out.println(ans);
        sc.close();
    }
}
