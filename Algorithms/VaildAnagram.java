public class VaildAnagram {

    public boolean check(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[] n=new int[26];
        for(int i=0;i<s.length();i++){
            n[s.charAt(i) - 'a']++;
        }
        for(int j=0;j<t.length();j++){
            n[t.charAt(j) - 'a']--;
            if(n[t.charAt(j) - 'a']<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="rat";
        String t="ear";

        VaildAnagram sc= new VaildAnagram();
        System.out.println(sc.check(s, t));
        
    }

    
    
}
