class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        if(t.length()==0){
            return false;
        }
        int j =0;
        int i =0;
        while(j<t.length()&&i<s.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
            if(i==s.length()){
                return true;
            }
        }
        return false;
    }
}
