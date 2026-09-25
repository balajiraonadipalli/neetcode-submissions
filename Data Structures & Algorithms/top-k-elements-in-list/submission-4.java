class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int i=0;
        int idx = 0;
        int[][] result = new int[n][2];
        while(i<n){
            int count = 1;
            while(i+1<n && nums[i]==nums[i+1]){
                count++;
                i++;
            }
            result[idx][0] = nums[i];
            result[idx][1] = count;
            idx++;
            i++;
        }
        Arrays.sort(result,0,idx,(a,b)->Integer.compare(a[1],b[1]));
        int[] res = new int[k];
        int j=0;
        for(int m = idx-1;m>=idx-k;m--){
            res[j++] = result[m][0];
        }
    return res;
    }
}
