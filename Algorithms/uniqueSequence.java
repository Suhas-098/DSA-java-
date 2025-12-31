import java.util.HashSet;

public class uniqueSequence {
     public static void calc(String str,int idx,String newString,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }else{

        System.out.println(newString);
        set.add(newString);
        return ;
        }}

        //step 1 convert the str into lenght
        char current=str.charAt(idx);
        //step 2 to find wheather a wants to move to sequence or not if yes this is the step
        calc(str, idx+1, newString+current,set );
        //step 3 else
            calc(str, idx+1, newString,set );
    }

    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set=new HashSet<>();
        calc(str, 0, "",set);

        
    }
}
