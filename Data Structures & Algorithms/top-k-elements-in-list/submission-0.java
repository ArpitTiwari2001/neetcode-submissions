class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr=new int[k];
        int n=k-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(Integer i: nums){
            if (!map.containsKey(i)){
                map.put(i,1);
            }
            else {
                map.put(i,map.get(i)+1);
            }
        }
        ArrayList<Integer> arrays= new ArrayList<>(map.values());
        Collections.sort(arrays);
        for(Integer j: map.keySet()) {
             if(n>=0 && map.get(j)>= arrays.get(arrays.size() - k)) {
                 arr[n] = j;
                 n--;
             }
        }
        return arr;
    }
}
