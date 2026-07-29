class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i: nums){
            hashmap.put(i,hashmap.getOrDefault(i,0)+1);
        }
        int[] answer =new int[k];
        List<Integer>[] cntBucket=new List[nums.length+1];
        for(int i: hashmap.keySet()){
            if(cntBucket[hashmap.get(i)]==null){
                cntBucket[hashmap.get(i)]=new ArrayList<>();
            }
            cntBucket[hashmap.get(i)].add(i);
        }
        for(int j=cntBucket.length-1;j>-1;j--){
            if(k==0){
                return answer;
            }
            if(!(cntBucket[j]==null)){
                for (Integer p : cntBucket[j]) {
                    answer[k-1]=p;
                    k=k-1;
                    if(k==0){
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
