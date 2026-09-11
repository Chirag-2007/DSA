// 3917. Count Indices With Opposite Parity

import java.util.Scanner;

public class Question82 {

    public static int[] countOppositeParity(int[] nums) {
       int n = nums.length;
        int[] answer = new int[n];
        int even = 0;
        int odd = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        int k = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] % 2 == 0){
                even--;
                answer[k++] = odd;
            }
            else{
                odd--;
                answer[k++] = even;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = countOppositeParity(arr);
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
