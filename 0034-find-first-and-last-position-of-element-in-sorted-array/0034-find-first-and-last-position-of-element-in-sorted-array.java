class Solution {
    int findfirstIndex(int[] arr,int target){
    int low=0;
    int high=arr.length-1;
    while(low<=high){
         int mid=(low+high)/2;
        if(arr[mid]==target){
          if(mid==0||arr[mid]!=arr[mid-1]){
            return mid;
          }
            high=mid-1;
          }
          else if(arr[mid]<target){
            low=mid+1;
          }else{
            high=mid-1;
          }
        }
        return -1;
    }
    int findlastIndex(int[] arr, int target){
         int low=0;
         int high=arr.length-1;
         while(low<=high){
         int mid=(low+high)/2;
        if(arr[mid]==target){
          if(mid==arr.length-1||arr[mid]!=arr[mid+1]){
            return mid;
          }
            low=mid+1;
          }
          else if(arr[mid]>target){
            high=high-1;
          }else{
             low=mid+1;
          }
        }
        return -1;
       }
    public int[] searchRange(int[] nums, int target) {
        int startIndex=findfirstIndex(nums, target);//0(logN)
        int lastIndex= findlastIndex(nums,target);
        int[] ans=new int[2];
        ans[0]=startIndex;
        ans[1]=lastIndex;
        return ans;
    }
}
        