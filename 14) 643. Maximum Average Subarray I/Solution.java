class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average = 0.0;
        for (int j = 0; j <  k; j++) {
            average += nums[j];
        }
        double max = average/k;
        for (int i = k; i < nums.length; i++) {
            average += nums[i] - nums[i - k];
            max=Math.max(max,average/k);
        }
        return max;
    }
}