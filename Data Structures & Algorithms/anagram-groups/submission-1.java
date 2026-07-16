class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();
        for(String string: strs){
            int[] c= new int[26];
            for(int i=0;i<string.length();i++){
                c[string.charAt(i)-'a']++;
            }
            String key=Arrays.toString(c);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(string);
        }
        return new ArrayList<>(map.values());
    }
}
