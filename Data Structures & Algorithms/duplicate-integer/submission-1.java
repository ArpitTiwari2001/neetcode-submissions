class Solution {
    public boolean hasDuplicate(int[] nums) {
        //Map<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            //if (map.containsKey(nums[i])) {
            if (set.contains(nums[i])) {
                return true;
            }
            //map.put(nums[i],1);
            set.add(nums[i]);
        }
        return false;
    }
}