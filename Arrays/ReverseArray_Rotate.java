package Arrays;

import java.util.Arrays;

public class ReverseArray_Rotate {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);      // reverse all
         reverse(nums, 0, k - 1);      // reverse first k
        reverse(nums, k, n - 1);      // reverse rest
    }

    public void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};

        ReverseArray_Rotate s = new ReverseArray_Rotate();
        s.rotate(nums, 3);

        System.out.println(Arrays.toString(nums));
    }
}
