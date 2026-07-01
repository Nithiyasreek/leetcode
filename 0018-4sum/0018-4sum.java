class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> finalAns=new ArrayList<>();
        HashSet<List<Integer>> h1=new HashSet<>();
        Arrays.sort(nums);
        int numsLength=nums.length;
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int start=j+1;
                int end=nums.length-1;
                while(start<end){
                    long sums=(long)nums[i]+nums[j]+nums[start]+nums[end];
                    if(sums==target){
                        List<Integer> l1=new ArrayList<>();
                        l1.add(nums[i]);
                        l1.add(nums[j]);
                        l1.add(nums[start]);
                        l1.add(nums[end]);
                        h1.add(l1);
                        start++;
                        end--;
                    }
                    else if(sums<target){
                         start++;
                     }
                else{
                     end--;
                  }
                }
            }
        }
      for(var it:h1){
        finalAns.add(it); 
      }
       return finalAns;
    }
}