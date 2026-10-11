// 2778. Sum of Squares of Special Elements 

import java.util.Scanner;

public class Question113 {

    public static int sumOfSquares(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(n % (i + 1) == 0){
                ans += (nums[i] * nums[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int ans = sumOfSquares(nums);
        System.out.println(ans);
        sc.close();
    }
}
