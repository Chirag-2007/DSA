// 415. Add Strings

import java.util.Scanner;

public class Question56 {

    public static String addStrings(String num1, String num2) {
        char[] val1 = num1.toCharArray();
        char[] val2 = num2.toCharArray();
        int n1 = val1.length;
        int n2 = val2.length;
        StringBuilder sb = new StringBuilder();
        int i = n1 - 1, j = n2 - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int x = (i >= 0) ? val1[i] - '0' : 0;
            int y = (j >= 0) ? val2[j] - '0' : 0;
            int total = x + y + carry;
            if(total > 9){
                int last = total % 10;
                sb.append((char)(last + '0'));
                carry = total / 10;
            }
            else{
                sb.append((char)(total + '0'));
                carry = 0;
            }
            i--;
            j--;
        }
        if(carry != 0){
            sb.append((char)(carry + '0'));
        }
        sb.reverse();
        String str = sb.toString();
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        String ans = addStrings(num1, num2);
        System.out.println(ans);
        sc.close();
    }
}
