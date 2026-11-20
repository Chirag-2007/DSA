// Print N to 1

import java.util.Scanner;

public class Question154 {

    public static void print(int n){
        // Base Condition
        if(n == 1){
            System.out.println(1);
            return;
        }
        // Induction
        System.out.println(n);
        print(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
}
