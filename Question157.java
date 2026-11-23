// Print Subsets

import java.util.Scanner;
import java.lang.StringBuilder;

public class Question157 {

    public static void solve(StringBuilder ip, StringBuilder op){
        // Base condition
        if(ip.length() == 0){
            System.out.println(op);
            return;
        }
        // Create two separate outputs
        StringBuilder op1 = new StringBuilder(op);
        StringBuilder op2 = new StringBuilder(op);

        // Create remaining input
        StringBuilder newIp = new StringBuilder(ip);
        char ch = newIp.charAt(0);
        newIp.deleteCharAt(0);

        // Exclude
        solve(newIp, op1);
        // Include
        op2.append(ch);
        solve(newIp, op2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        StringBuilder ip = new StringBuilder(in);
        StringBuilder op = new StringBuilder("");
        solve(ip, op);
        sc.close();
    }
}
