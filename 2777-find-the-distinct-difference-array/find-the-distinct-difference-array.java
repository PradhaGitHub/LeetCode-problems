class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=left(i,nums);
        }
        return arr;
    }
    public static int left(int n,int[] nums){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<=n;i++)set.add(nums[i]);
        Set<Integer> set1=new HashSet<>();
        for(int i=n+1;i<nums.length;i++)set1.add(nums[i]);
        return set.size()-set1.size();
    }
}