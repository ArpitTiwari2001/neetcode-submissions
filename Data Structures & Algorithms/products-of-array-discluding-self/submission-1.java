class Solution {
    public int[] productExceptSelf(int[] nums) {
                int[] arr = new int[nums.length];
        int prefix=1;
        int postfix=1;
        for(int i=0;i<nums.length;i++){
            arr[i]=prefix;
            prefix=prefix*nums[i];
        }
        for(int i=nums.length-1;i>-1;i--){
            arr[i]=postfix*arr[i];
            postfix=postfix*nums[i];
        }
        return arr;
    }
}  
