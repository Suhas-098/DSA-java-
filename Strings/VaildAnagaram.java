package Strings;
// import java.util.*;

public class VaildAnagaram {
    public static boolean isAnagram(String s, String t) {
        int[] n = new int[26];
     for(int i=0;i<s.length();i++){
        n[s.charAt(i)-'a']++;
     }
     for(int j=0;j<t.length();j++){
        n[t.charAt(j)-'a']--;
        if(n[t.charAt(j)-'a']<0){
        return false;
        }
     }
     return true;
}    
    public static void main(String[] args) {
        
        System.out.println(isAnagram("rat", "cat"));
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
