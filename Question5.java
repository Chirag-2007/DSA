// Print all Divisors

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question5 {
    
    public ArrayList<Integer> getDivisors(int n){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 1; i * i <= n; i++){
            if(n % i == 0){
                arr.add(i);
                if(i != n / i){
                    arr.add(n / i);
                }
            }
        }
        Collections.sort(arr);
        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Question5 obj = new Question5();
        ArrayList<Integer> divisors = obj.getDivisors(n);
        for(int x : divisors){
            System.out.print(x + " ");
            sc.close();
        }
    }
}
