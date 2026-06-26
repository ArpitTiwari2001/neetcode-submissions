class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] answer=new int[k];
        List<Integer>[] cntBucket=new List[nums.length+1];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(Integer i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Integer key: map.keySet()){
            if(cntBucket[map.get(key)]==null){
                cntBucket[map.get(key)]=new ArrayList<>();
            }
            cntBucket[map.get(key)].add(key);
        }
        for(int j=cntBucket.length-1;j>-1;j--){
            if(k<=0){
                return answer;
            }
            if (cntBucket[j]!=null && k>=0){
                for(Integer p : cntBucket[j]){
                    answer[k-1]=p;
                    k--;
                }
            }
        }
        return answer;
    }
}
