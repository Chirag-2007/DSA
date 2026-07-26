// 349. Intersection of Two Arrays

import java.util.HashSet;
import java.util.Scanner;

public class Question35 {

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int val : nums1){
            set.add(val);
        }
        for(int val : nums2){
            if(set.contains(val)){
                result.add(val);
            }
        }
        int i = 0;
        int[] arr = new int[result.size()];
        for(int num : result){
            arr[i++] = num;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] num1 = new int[n1];
        for(int i = 0; i < n1; i++){
            num1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] num2 = new int[n2];
        for(int j = 0; j < n2; j++){
            num2[j] = sc.nextInt();
        }
        int[] ans = intersection(num1, num2);
        int n =ans.length;
        System.out.print("[");
        for(int i = 0; i < n; i++){
            if(n == 1){
                System.out.print(ans[0]);
            }
            else{
                if(i == n - 1){
                    System.out.print(ans[i]);
                }
                else{
                    System.out.print(ans[i] + ",");
                }
            }
        }
        System.out.print("]");
        sc.close();
    }   
}