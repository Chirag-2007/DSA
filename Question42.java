// Length of Last Word

import java.util.Scanner;

public class Question42 {

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int n = s.length();
        int i = n - 1;
        int count = 0;
        while(i != -1 && s.charAt(i) != ' '){
            count++;
            i--;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = lengthOfLastWord(s);
        System.out.println(ans);
        sc.close();
    }
}
