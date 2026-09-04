// 2264. Largest 3-Same-Digit Number in String

import java.util.Scanner;

public class Question75 {

    public static String largestGoodInteger(String num) {
        int n = num.length();
        int maxNum = -1;
        int count = 1;
        for(int i = 1; i < n; i++){
            if(num.charAt(i) == num.charAt(i - 1)){
                count++;
            }
            else{
                count = 1;
            }
            if(count == 3){
                String sub = num.substring(i - 2, i + 1);
                int ans = Integer.parseInt(sub);
                maxNum = Math.max(maxNum, ans);
            }
        }
        if(maxNum == -1){
            return "";
        }
        if(maxNum == 0){
            return "000";
        }
        return Integer.toString(maxNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String ans = largestGoodInteger(num);
        System.out.println(ans);
        sc.close();
    }
}
