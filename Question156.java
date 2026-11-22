// 2124. Check if All A's Appears Before All B's

import java.util.Scanner;

public class Question156 {

    public static boolean checkString(String s) {
        if(s.contains("ba")){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean ans = checkString(s);
        System.out.println(ans);
        sc.close();
    }
}
