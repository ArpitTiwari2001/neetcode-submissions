class Solution {

    public String encode(List<String> strs) {
        String str = "";
        for(String string:strs){
            str+=string.length()+"#"+string;
        }
        return str;
    }

    public List<String> decode(String str) {
        List<String> strs=new ArrayList<>();
        String slen="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != '#'){
                slen+=str.charAt(i);
            }
            else{
                int k=Integer.parseInt(slen);
                strs.add(str.substring(i+1,i+k+1));
                slen="";
                i+=k;
            }
        }
        return strs;
    }
}
