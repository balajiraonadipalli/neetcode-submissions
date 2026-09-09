class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 1;
        int count = 1;
        if(nums.length==0) return 0;
        if(nums.length ==1 ) return 1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] == nums[i]){
                continue;
            }
            if(nums[i-1]+1 == nums[i]){
                count++;
            }else{
                max = Math.max(count,max);
                count=1;
            }
        }
        max = Math.max(count,max);
        return max;
    }
}
