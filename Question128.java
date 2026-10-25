// 728. Self Dividing Numbers

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question128 {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(i < 10){
                arr.add(i);
            }
            else{
                int temp = i;
                boolean flag = true;
                while(temp > 0){
                    int last = temp % 10;
                    if(last == 0 || i % last != 0){
                        flag = false;
                        break;
                    }
                    temp = temp / 10;
                }
                if(flag == true){
                    arr.add(i);
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        List<Integer> ans = selfDividingNumbers(left, right);
        System.out.println(ans);
        sc.close();
    }
}
