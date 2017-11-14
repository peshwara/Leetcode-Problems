//Given a string, find the length of the longest substring without repeating characters.



public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s == null)
            return 0;
        int maxlen = Integer.MIN_VALUE;
        int start = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)){
                maxlen= Math.max(maxlen, i-start);
                while(set.contains(c)){
                    set.remove(s.charAt(start));
                    start++;
                }
                set.add(c);
            }else{
                set.add(c);
            }
        }
        maxlen = Math.max(maxlen, s.length()-start);;
        return maxlen;
    }
}