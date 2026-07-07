class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int count=0;
        HashMap<Integer,Integer> h=new HashMap();
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum==k){
                count++;
            }
            if(h.get(sum-k)!=null){
                count=count+h.get(sum-k);
            }
            Integer prev=h.get(sum);
            if(prev==null)
            h.put(sum,1);
            else
            h.put(sum,prev+1);
        }
    return count;
    }
}