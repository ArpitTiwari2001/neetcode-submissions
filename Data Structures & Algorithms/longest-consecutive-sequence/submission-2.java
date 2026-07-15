class Solution {
    public int longestConsecutive(int[] nums) {
       int longest=0;
       HashSet<Integer> set= new HashSet<>();
       for(int i: nums){
           set.add(i);
       }
       for(int i=0;i<nums.length;i++){
           if(!set.contains(nums[i]-1)) {
               int count = 1;
               int start = nums[i];
               while (set.contains(start + 1)){
                   start++;
                   count++;
               }
               if (count > longest) longest = count;
           }
       }
       return longest;
    }
}
