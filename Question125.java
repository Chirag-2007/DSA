// 75. Sort Colors

import java.util.Scanner;

public class Question125 {

    public static void sortColors(int[] nums) {
        int n = nums.length;
        int start = 0;
        int mid = 0;
        int end = n - 1;
        while(mid <= end){
            if(nums[mid] == 0){
                int temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                start++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        sortColors(nums);
        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }
}
