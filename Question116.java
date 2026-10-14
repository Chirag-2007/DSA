// 1700. Number of Students Unable to Eat Lunch

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Question116 {

    public static int countStudents(int[] students, int[] sandwiches) {
        int n1 = students.length;
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < n1; i++){
            q.offer(students[i]);
        }
        int i = 0;
        int counter = 0;
        while(!q.isEmpty() && counter < q.size()){
            if(q.peek() == sandwiches[i]){
                q.poll();
                i++;
                counter = 0;
            }
            else{
                int val = q.poll();
                q.offer(val);
                counter++;
            }
        }
        return q.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] students = new int[n1];
        for(int i = 0; i < n1; i++){
            students[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] sandwiches = new int[n2];
        for(int i = 0; i < n2; i++){
            sandwiches[i] = sc.nextInt();
        }
        int ans = countStudents(students, sandwiches);
        System.out.println(ans);
        sc.close();
    }
}
