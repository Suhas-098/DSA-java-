package Strings;

public class LongestPalindromeSubString {
    public static String longestPalindrome(String s) {
        String longest="";

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
            
                String sub=s.substring(i,j+1);

                if(checkPalindrome(sub)){
                    if(sub.length()>longest.length()){
                        longest=sub;
                    }
                }
            }
        }
        return longest;
    }

    public static boolean checkPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
       
        // output=bab or aba
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cabbad"));
    }
}
