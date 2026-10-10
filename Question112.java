// 901. Online Stock Span

import java.util.Scanner;
import java.util.Stack;

class StockSpanner {

    Stack<int[]> st;

    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        while(st.size() > 0 && price >= st.peek()[0]){
            span += st.peek()[1];
            st.pop();
        }
        st.push(new int[]{price, span});
        return st.peek()[1];
    }
}

public class Question112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StockSpanner s = new StockSpanner();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int val = sc.nextInt();
            System.out.print(s.next(val) + " ");
        }
        sc.close();
    }
}
