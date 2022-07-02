import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.singleNumber(new int[]{1, 2, 1, 3, 3});
    }

    public int singleNumber(int[] nums) {

        ArrayList<Integer> numbers = new ArrayList<>();
        int value = 0;
        for(int i = 0; i<nums.length; i++) {
            value = value + nums[i];
            if(numbers.contains(nums[i])) {
                value = value - nums[i] * 2;
            }
            numbers.add(i, nums[i]);
        }
       return value;
    }
}
