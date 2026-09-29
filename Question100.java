// 2696. Minimum String Length After Removing Substrings

import java.util.Scanner;
import java.util.Stack;

public class Question100 {

    public static int minLength(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(st.size() > 0 && ((ch == 'B' && st.peek() == 'A') || (ch == 'D' && st.peek() == 'C'))){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        return st.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = minLength(str);
        System.out.println(ans);
        sc.close();
    }
}
