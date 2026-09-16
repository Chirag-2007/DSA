// 2089. Find Target Indices After Sorting Array

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question87 {

    public static List<Integer> targetIndices(int[] arr, int target) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int num = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] < target){
                num++;
            }
            else if(arr[i] == target){
                count++;
            }
        }
        while(count > 0){
            ans.add(num);
            num++;
            count--;
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
        int target = sc.nextInt();
        List<Integer> ans = targetIndices(arr, target);
        System.out.println(ans);
        sc.close();
    }
}
