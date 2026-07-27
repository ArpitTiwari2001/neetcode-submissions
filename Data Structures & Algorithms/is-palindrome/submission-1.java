class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(!((s.charAt(i)<=57 && s.charAt(i)>=48) || (s.charAt(i)<=90 && s.charAt(i)>=65) || (s.charAt(i)<=122 && s.charAt(i)>=97))){
                i++;
                continue;
            }
            if(!((s.charAt(j)<=57 && s.charAt(j)>=48) || (s.charAt(j)<=90 && s.charAt(j)>=65) || (s.charAt(j)<=122 && s.charAt(j)>=97))){
                j--;
                continue;
            }
            if(s.charAt(i)!=s.charAt(j)){
                if((s.charAt(i)<=57 && s.charAt(i)>=48) || (s.charAt(j)<=57 && s.charAt(j)>=48)){
                    return false;}
                if(s.charAt(i)-32!=s.charAt(j) && s.charAt(i)+32!=s.charAt(j)){
                    return false;
                }
            }
            i++;
            j--;
        }
        return true;
        
    }
}
