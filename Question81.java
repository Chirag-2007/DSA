// 303. Range Sum Query - Immutable

public class Question81 {

    int[] prefix;

    public Question81(int[] nums) {
        int n = nums.length;
        prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1; i < n; i++){ 
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if(left == 0){
            return prefix[right];
        }
        int sum = prefix[right] - prefix[left - 1];
        return sum;
    }
    public static void main(String[] args) {

        int[] nums = {-2, 0, 3, -5, 2, -1};

        Question81 obj = new Question81(nums);

        System.out.println(obj.sumRange(0, 2));
        System.out.println(obj.sumRange(2, 5));
        System.out.println(obj.sumRange(0, 5));
    }
}
