// 1903. Largest Odd Number in String

import java.util.Scanner;

public class Question69 {

    public static String largestOddNumber(String num) {
        int n = num.length();
        if((int)num.charAt(n - 1) % 2 != 0) return num;
        int pt = -1;
        for(int i = n - 1; i >= 0; i--){
            int val = (int)num.charAt(i);
            if(val % 2 != 0){
                pt = i;
                break;
            }
        }
        return num.substring(0, pt + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String ans = largestOddNumber(num);
        System.out.println(ans);
        sc.close();
    }
}
