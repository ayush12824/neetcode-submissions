class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                product=product*nums[i];
            }else{
                count++;
            }
        }

        int[] output=new int[nums.length];
        if(count>1){
            return output;
        }
        for(int i=0;i<nums.length;i++){
            if(count==1){
                if(nums[i]!=0){
                    output[i]=0;
                }else{
                    output[i]=product;
                }
            }else{
                output[i]=(int)(product/nums[i]);
            }
        }

        return output;
    }
}  
