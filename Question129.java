// 1979. Find Greatest Common Divisor of Array

import java.util.Scanner;

public class Question129 {

    public static int findGCD(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int gcd = 1;
        for(int i = 0; i < n; i++){
            if(min > nums[i]){
                min = nums[i];
            }
            if(max < nums[i]){
                max = nums[i];
            }
        }
        for(int i = 1; i <= min; i++){
            if(min % i == 0 && max % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int ans = findGCD(nums);
        System.out.println(ans);
        sc.close();
    }
}
