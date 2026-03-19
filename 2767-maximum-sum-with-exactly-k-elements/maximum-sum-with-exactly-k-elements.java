class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=0;
        for(int i:nums)max=Math.max(i,max);
        int sum=0;
        for(int i=max;i<max+k;i++)sum+=i;
        return sum;
    }
}