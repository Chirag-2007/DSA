// Sort A Stack

import java.util.Scanner;
import java.util.Stack;

public class Question152 {

    public static void insert(Stack<Integer> st, int temp){
        int n = st.size();
        // Base Condition
        if(n == 0 || st.peek() <= temp){
            st.push(temp);
            return;
        }
        // Hypothesis
        int val = st.peek();
        st.pop();
        insert(st, temp);
        // Induction
        st.push(val);
    }

    public static void sortStack(Stack<Integer> st){
        int n = st.size();
        // Base Condition
        if(n == 1){
            return;
        }
        // Hypothesis
        int temp = st.peek();
        st.pop();
        sortStack(st);
        // Induction
        insert(st, temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            st.push(sc.nextInt());
        }
        System.out.println("Original Stack: " + st);
        sortStack(st);
        System.out.println("Sorted Stack: " + st);
        sc.close();
    }
}
