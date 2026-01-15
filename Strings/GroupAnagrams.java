package Strings;
import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagram(String[] strs){

        Map<String, List<String>>map=new HashMap<>();

        for(String words:strs){
            char[] ch=words.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
                map.get(key).add(words);
            
        }
        return new ArrayList<>(map.values());
        
    }
    
    public static void main(String[] args) {
        String[] strs= {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram(strs));
    }
    
}
