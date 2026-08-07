// 287. Find the Duplicate Number

import java.util.Scanner;

public class Question47 {

    public static int findDuplicate(int[] arr){
        int n = arr.length;
        int[] freq = new int[n];
        for(int i = 0; i < n; i++){
            freq[arr[i]]++;
        }
        for(int i = 0; i < n; i++){
            if(freq[i] > 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = findDuplicate(arr);
        System.out.println(ans);
        sc.close();
    }
}
