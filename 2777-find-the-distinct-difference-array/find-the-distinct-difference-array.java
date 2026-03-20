class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=left(i,nums)-right(i+1,nums);
        }
        return arr;
    }
    public static int left(int n,int[] nums){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<=n;i++)set.add(nums[i]);
        return set.size();
    }
    public static int right(int n,int[] nums){
        Set<Integer> set=new HashSet<>();
        for(int i=n;i<nums.length;i++)set.add(nums[i]);
        return set.size();
    }
}