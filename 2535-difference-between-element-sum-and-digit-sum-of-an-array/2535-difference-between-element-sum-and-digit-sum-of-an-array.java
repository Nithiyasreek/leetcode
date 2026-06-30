class Solution {
    public int differenceOfSum(int[] nums){
        int es=0;
        int ds=0,digit=0;
        for(int i=0;i<nums.length;i++){
            es=es+nums[i];
            while(nums[i]>0){
                digit=nums[i]%10;
                ds=ds+digit;
                nums[i]=nums[i]/10;
                }
            }
          if(es>ds) return es-ds;
          else return ds-es;         

        }
    }
     
           
        

      
        
    
