class Solution {
    public int pivotIndex(int[] nums) {
        int t=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            t=t+nums[i];
        }
        for(int i=0;i<nums.length;i++){
           if(l==t-l-nums[i]){
            return i;
            }
      l=l+nums[i];
        }
      return -1;
    }
}