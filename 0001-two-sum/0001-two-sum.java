class Solution {
    public int[] twoSum(int[] nums, int target) {
        //변수 생성
        int n = nums.length;
        
        //각각의 i변수와 j변수에 n값 비교
        for(int i =0; i<n -1; i++){
            for(int j = i +1; j < n; j++){
                
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}