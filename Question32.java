// LeetCode 42 – Trapping Rain Water (Gold Question)

import java.util.Scanner;

public class Question32 {

    // Brute force solution
    // Time Complexity: O(n²), Space Complexity: O(1)

    // Outer loop hr 1 element ke liya chalega.
    // Hr 1 i ke liya leftMax and rightMax nikalna h and oske baad water kitna blocks ma store hoga osko nikalna h using this formula ->
    // Math.min(leftMax, rightMax) - height[i]
    // Do this for every element in the array.

    public static int trap(int[] height){
        int n = height.length;
        int totalWater = 0;
        for(int i = 0; i < n; i++){
            int leftMax = Integer.MIN_VALUE;
            int rightMax = Integer.MIN_VALUE;
            for(int j = 0; j <= i; j++){
               if(leftMax < height[j]){
                    leftMax = height[j];
               } 
            }
            for(int j = i; j < n; j++){
               if(rightMax < height[j]){
                    rightMax = height[j];
               } 
            }
            int water = Math.min(leftMax, rightMax) - height[i];
            if(water > 0){
                totalWater += water;
            }
        }
        return totalWater;
    }

    // Two-Pointers
    // Time Complexity: O(n), Space Complexity: O(1)

    // Jis side ka max chhota ho (leftMax <= rightMax), us side ka water confidently calculate kar sakte hain.
    // Formula Used -> totalWater += leftMax - height[left, right]
    public static int trap1(int[] height){
        int n = height.length;
        int left = 0, right = n - 1;
        int leftMax = 0;
        int rightMax = 0;
         int totalWater = 0;
        while(left <= right){
            if(leftMax <= rightMax){
                if(height[left] >= leftMax){
                    leftMax = height[left];
                }
                else{
                    totalWater += leftMax - height[left];
                }
                left++;
            }
            else{
                if(height[right] >= rightMax){
                    rightMax = height[right];
                }
                else{
                    totalWater += rightMax - height[right];
                }
                right--;
            }
        }
        return totalWater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int totalWater = trap1(arr);
        System.out.println(totalWater);
        sc.close();
    }
}