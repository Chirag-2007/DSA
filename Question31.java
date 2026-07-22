// 3Sum

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Question31 {

    // Time Complexity: O(n³), Space Complexity: O(k) (k = number of unique triplets)
    public static List<List<Integer>> threeSum(int[] arr){
        int n = arr.length;
        Set<List<Integer>> set = new HashSet<>(); // Set - for unique list in the array.
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> row = new ArrayList<>();
                        row.add(arr[i]);
                        row.add(arr[j]);
                        row.add(arr[k]);
                        Collections.sort(row);
                        set.add(row);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    // Time Complexity: O(n²), Space Complexity: O(k) (k = number of unique triplets), Auxiliary Space: O(log n) (due to Arrays.sort())
    public static List<List<Integer>> threeSumOptimal(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n - 2; i++){
            if (i > 0 && arr[i] == arr[i - 1]){
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == 0){
                    List<Integer> row = new ArrayList<>();
                    row.add(arr[i]);
                    row.add(arr[left]);
                    row.add(arr[right]);
                    ans.add(row);
                    left++;
                    right--;
                    while (left < right && arr[left] == arr[left - 1]){
                        left++;
                    }
                    while (left < right && arr[right] == arr[right + 1]){
                        right--;
                    }
                }
                else if(sum > 0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> ans = threeSumOptimal(arr);
        for(List<Integer> row : ans){
            System.out.println(row);
        }
        sc.close();
    }
}