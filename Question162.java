// Permutation with spaces

import java.util.Scanner;

public class Question162 {

    public static void solve(StringBuilder ip, StringBuilder op){
        // Base Condition
        if(ip.length() == 0){
            System.out.println(op);
            return;
        }
        StringBuilder op1 = new StringBuilder(op);
        StringBuilder op2 = new StringBuilder(op);

        char ch = ip.charAt(0);
        StringBuilder newIp = new StringBuilder(ip);
        newIp.deleteCharAt(0);

        // Include
        op1.append("_");
        op1.append(ch);

        // Exclude
        op2.append(ch);

        solve(newIp, op1);
        solve(newIp, op2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder ip = new StringBuilder(s);
        char ch = ip.charAt(0);
        StringBuilder op = new StringBuilder("" + ch);
        ip.deleteCharAt(0);
        solve(ip, op);
        sc.close();
    }
}
