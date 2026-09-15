// 4011. Count Subarrays With Even Odd Ratio I

import java.util.Scanner;

public class Question86 {

    public static int countRatioSubarrays(int[] nums, int a, int b) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            int even_count = 0;
            int odd_count = 0;
            for(int j = i; j < n; j++){
                if(nums[j] % 2 == 0){
                    even_count++;
                }
                else{
                    odd_count++;
                }
                if(odd_count > 0 && (double)even_count / odd_count <= (double)a / b){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = countRatioSubarrays(nums, a, b);
        System.out.println(ans);
        sc.close();
    }
}
