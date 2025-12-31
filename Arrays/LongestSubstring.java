package Arrays;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>set= new HashSet<>();
          int left=0;
          int maxlen=0;
        for(int i=0;i<s.length();i++){
            char store= s.charAt(i);
        if(set.contains(store)){
            set.remove(s.charAt(left));
            left++;
        }
        else{
           set.add(store);
           maxlen=Math.max(maxlen, set.size());
        }
        }
       return maxlen;
        
    }

public static void main(String[] args) {
    String s = "abcabcbb";

    Solution obj = new Solution();
    int result = obj.lengthOfLongestSubstring(s);

    System.out.println(result);
}
}