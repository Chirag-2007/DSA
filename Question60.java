// 442. Find All Duplicates in an Array

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question60 {

    public static List<Integer> findDuplicates(int[] arr){
        int n = arr.length;
        int[] freq = new int[n + 1];
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            freq[arr[i]]++;
        }
        for(int i = 0; i < n + 1; i++){
            if(freq[i] > 1){
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        List<Integer> ans = findDuplicates(arr);
        System.out.println(ans);
        sc.close();
    }
}
