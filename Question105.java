// 402. Remove K Digits

import java.util.Scanner;
import java.util.Stack;

public class Question105 {

    public static String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> st = new Stack<>();
        if(n == k) return "0";
        for(int i = 0; i < n; i++){
            char ch = num.charAt(i);
            while(st.size() > 0 && k > 0 && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k > 0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();
        int i = 0;
        while(i < ans.length() && ans.charAt(i) == '0'){
            i++;
        }
        ans = new StringBuilder(ans.substring(i));
        return ans.length() == 0 ? "0" : ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int k = sc.nextInt();
        String ans = removeKdigits(num, k);
        System.out.println(ans);
        sc.close();
    }
}
