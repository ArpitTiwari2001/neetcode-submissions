class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String i:strs){
            int[] arr=new int[26];
            for(Character j: i.toCharArray()){
                arr[j-'a']++;
            }
            String key = Arrays.toString(arr);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(i);
        }
        return new ArrayList<>(map.values());
    }
}
