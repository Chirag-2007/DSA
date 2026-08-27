// 151. Reverse Words in a String

import java.util.Scanner;

public class Question67 {

    public static String reverseWords(String s) {
        // (\\s+) String ko one or more whitespace characters ke basis par todta hai
        // \\s → whitespace, + → one or more
        String[] ch = s.trim().split("\\s+");
        int n = ch.length;
        StringBuilder sb = new StringBuilder();
        for(int i = n - 1; i >= 0; i--){
            sb.append(ch[i]);
            if(i != 0){
                sb.append(' ');
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = reverseWords(s);
        System.out.println(ans);
        sc.close();
    }
}
