// 394. Decode String

import java.util.Scanner;
import java.util.Stack;

public class Question104 {

    public static String decodeString(String s) {
        int n = s.length();
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                count = count * 10 + (ch - '0');
            }
            else if(ch == '['){
                stringStack.push(sb);
                countStack.push(count);
                sb = new StringBuilder();
                count = 0;
            }
            else if(ch == ']'){
                int repeat = countStack.pop();
                StringBuilder prev = stringStack.pop();
                for(int j = 0; j < repeat; j++){
                    prev.append(sb);
                }
                sb = prev;
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = decodeString(s);
        System.out.println(ans);
        sc.close();
    }
}
