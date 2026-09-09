class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        int m = 0,n=0;
        for(int i=0;i<nums.length;i++){
            int t = target-nums[i];
            if(set.contains(t)){
                m = i;
            }else{
                set.add(nums[i]);
            }
        } 
        for(int i=0;i<nums.length;i++){
            if(nums[i] == (target-nums[m])){
                n = i;
                break;
            }
        }
        int[] arr = new int[2];
        if(m>n){
            arr[0]=n;
            arr[1]=m;
        }else{
            arr[0]=m;
            arr[1]=n;
        }
        return arr;
    }
}
