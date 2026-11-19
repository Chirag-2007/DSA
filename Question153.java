// Delete Middle Element of a Stack

// Middle Element(k) = size / 2 + 1;

import java.util.Scanner;
import java.util.Stack;

public class Question153 {

    public static void solve(Stack<Integer> st, int k){
        // Base Condition
        if(k == 1){
            st.pop();
            return;
        }
        // Hypothesis
        int temp = st.peek();
        st.pop();
        solve(st, k - 1);
        // Induction
        st.push(temp);
    }

    public static Stack<Integer> deleteMiddle(Stack<Integer> st, int size){
        if(st.size() == 0){
            return st;
        }
        int k = size / 2 + 1;
        solve(st, k);
        return st;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            st.push(sc.nextInt());
        }
        System.out.println("Original Stack: " + st);
        deleteMiddle(st, n);
        System.out.println("Stack after deleting middle element: " + st);
        sc.close();
    }
}
