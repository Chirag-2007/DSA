// 71. Simplify Path

import java.util.Scanner;
import java.util.Stack;

public class Question111 {

    public static String simplifyPath(String path) {
        String[] parts = path.split("/");
        int n = parts.length;
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(parts[i].equals("") || parts[i].equals(".")){
                continue;
            }
            else if(parts[i].equals("..")){
                if(st.size() > 0){
                    st.pop();
                }
            }
            else{
                st.push(parts[i]);
            }
        }
        if(st.size() == 0) return "/";
        for(String x : st){
            sb.append("/");
            sb.append(x);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        String ans = simplifyPath(path);
        System.out.println(ans);
        sc.close();
    }
}
