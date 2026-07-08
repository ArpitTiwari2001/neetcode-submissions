class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }
        for(int j=0;j<t.length();j++){
            if(!hashMap.containsKey(t.charAt(j))){
                return false;
            }
            hashMap.put(t.charAt(j),hashMap.get(t.charAt(j))-1);
            if (hashMap.get(t.charAt(j))==-1){
                return false;
            }
        }
        return true;
    }
}
