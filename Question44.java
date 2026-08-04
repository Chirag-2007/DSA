// Reverse Only Letters

import java.util.Scanner;

public class Question44 {

    public static String reverseOnlyLetters(String s){
        char[] arr = s.toCharArray();
        int n = s.length();
        int i = 0, j = n - 1;
        while(i <= j){
            if(!Character.isLetter(arr[i])){
                i++;
            }
            else if(!Character.isLetter(arr[j])){
                j--;
            }
            else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = reverseOnlyLetters(s);
        System.out.println(ans);
        sc.close();
    }
}
