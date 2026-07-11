// Sort an array of 0's 1's and 2's
// Time Complexity = O(n), Space Complexity = O(1)

import java.util.Scanner;

public class Question20 {

    public static void sortColors(int[] arr){
        int n = arr.length;
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                count_0++;
            }
            else if(arr[i] == 1){
                count_1++;
            }
            else if(arr[i] == 2){
                count_2++;
            }
        }
        int k = 0;
        while(count_0 > 0){
            arr[k++] = 0;
            count_0--;
        }
        while(count_1 > 0){
            arr[k++] = 1;
            count_1--;
        }
        while(count_2 > 0){
            arr[k++] = 2;
            count_2--;
        }
    }

    // Dutch National Flag Algorithm (DNF)
    public static void sortColors1(int[] arr){
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sortColors1(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}