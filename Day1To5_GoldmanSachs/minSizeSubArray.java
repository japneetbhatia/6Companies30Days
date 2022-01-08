class minSizeSubArray {
    public int minSubArrayLen(int target, int[] nums) {
        int lptr = 0;
        int res = (int)1e7;
        int ssf = 0;
        
        for(int i = 0; i < nums.length; i++) {
            ssf += nums[i];
            while(ssf >= target) {
                res = Math.min(res, i - lptr + 1);
                ssf -= nums[lptr];
                lptr++;
            }
        }
        
        return res != (int)1e7 ? res : 0;
    }
}