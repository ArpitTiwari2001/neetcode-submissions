class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int target = 0-nums[i];
            int j=i+1;
            int k=nums.length-1;
            while (j<k) {
                if(j!=i+1 && nums[j]==nums[j-1]) {j++; continue;}
                if(k!=nums.length-1 && nums[k]==nums[k+1]) {k--; continue;}
                if (nums[j] + nums[k] == target) {
                    answer.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                if (nums[j] + nums[k] < target) j++;
                if (nums[k] + nums[j] > target) k--;
            }
        }
        return answer;
    }
}
