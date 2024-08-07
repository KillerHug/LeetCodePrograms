class Solution {
    public void moveZeroes(int[] nums) {
        // int i = 0, j = 0;
        // while (i < nums.length) {
        //     if (nums[i] != 0) {
        //         int temp = nums[j];
        //         nums[j] = nums[i];
        //         nums[i] = temp;
        //         j++;
        //     }
        //     i++;
        // }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}