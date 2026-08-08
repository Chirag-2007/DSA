// 3731. Find Missing Elements

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Question48 {

    public static List<Integer> findMissingElements(int[] arr){
        int n = arr.length;
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }
        for(int i = 0; i < n; i++){
            if(minVal > arr[i]){
                minVal = arr[i];
            }
            if(maxVal < arr[i]){
                maxVal = arr[i];
            }
        }
        for(int i = minVal; i <= maxVal; i++){
            if(!set.contains(i)){
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
        List<Integer> ans = findMissingElements(arr);
        System.out.println(ans);
        sc.close();
    }
}