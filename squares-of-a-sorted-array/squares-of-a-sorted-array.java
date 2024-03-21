class Solution {
    public int[] sortedSquares(int[] nums) {
        int num_len = nums.length;
            for(int i=0; i<num_len; i++){
             nums[i] = nums[i] * nums[i];
            }
        Arrays.sort(nums);
            return nums;
    }
}