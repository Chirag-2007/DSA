// 1323. Maximum 69 Number

import java.util.Scanner;

public class Question83 {

    public static int maximum69Number(int num){
        int maxElm = num;
        String s = String.valueOf(num);
        int n = s.length();
        for(int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder(s);
            char ch = s.charAt(i);
            if(ch == '6'){
                sb.replace(i, i + 1, "9");
            }
            int val = Integer.parseInt(sb.toString());
            maxElm = Math.max(maxElm, val);
        }
        return maxElm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = maximum69Number(n);
        System.out.println(ans);
        sc.close();
    }
}
