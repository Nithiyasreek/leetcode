class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalAns=new ArrayList<>();
        HashSet<List<Integer>> h1=new HashSet<>();
        int i,j,k;
        int numsLength=nums.length;
        Arrays.sort(nums);
        for(i=0;i<nums.length-2;i++){
            int start=i+1;
            int end=numsLength-1;
        while(start<end){
           int sums=nums[i]+nums[start]+nums[end];
                if(sums==0){
                    List<Integer> l1=new ArrayList<>();
                    l1.add(nums[i]);
                    l1.add(nums[start]);
                    l1.add(nums[end]);
                    h1.add(l1);
                    start++;
                    end--;
                }
                 else if(sums<0){
                     start++;
                    }
                else{
                     end--;
                    }
             }
        }
        
                for(var it:h1){
                    finalAns.add(it);

                }
                return finalAns;
        
    }
}
