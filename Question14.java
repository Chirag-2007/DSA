// Max Consecutive Ones

import java.util.Scanner;

public class Question14{
    
    public static int findMaxConsecutiveOnes(int[] arr){
        int n = arr.length;
        int ans = 0;
        int count_1 = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 1){
                count_1++;
                if(ans < count_1){
                    ans = count_1;
                }
            }
            else{
                count_1 = 0;
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
        int count = findMaxConsecutiveOnes(arr);
        System.out.println(count);
        sc.close();
    }
}
