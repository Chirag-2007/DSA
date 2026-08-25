// 557. Reverse Words in a String III

import java.util.Scanner;

public class Question65 {

    public static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        for(int j = 0; j <= arr.length; j++){
            if(j == arr.length || arr[j] == ' '){
                int left = i;
                int right = j - 1;
                while (left < right){
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
                i = j + 1;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = reverseWords(s);
        System.out.println(ans);
        sc.close();
    }
}
