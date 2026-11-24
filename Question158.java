// Print unique subsets

import java.util.HashSet;
import java.util.Scanner;

public class Question158 {

    static HashSet<String> set = new HashSet<>();

    public static void solve(StringBuilder ip, StringBuilder op){
        // Base Condition
        if(ip.length() == 0){
            set.add(op.toString());
            return;
        }

        // Create two separate outputs
        StringBuilder op1 = new StringBuilder(op);
        StringBuilder op2 = new StringBuilder(op);

        // Create remaining input
        StringBuilder newIp = new StringBuilder(ip);
        char ch = ip.charAt(0);
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
        System.out.println(set);
        sc.close();
    }
}