class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int[] forwardProduct = new int[nums.length];
        int[] reverseProduct = new int[nums.length];
        forwardProduct[0]=nums[0];
        reverseProduct[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            int j=nums.length-i;
            forwardProduct[i]=forwardProduct[i-1]*nums[i];
            reverseProduct[j-1]=reverseProduct[j]*nums[j-1];
        }
        arr[0]=reverseProduct[1];
        arr[nums.length-1]=forwardProduct[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
            arr[i]=forwardProduct[i-1]*reverseProduct[i+1];
        }
        return arr;
    }
}  
