class Solution {
    public int missingNumber(int[] nums) {
        int orgsum=0,n=nums.length,sum=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            orgsum+=nums[i];
        }
        return (sum-orgsum);

    }
}