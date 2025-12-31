public class sequence {

    public static void calc(String str,int idx,String newString){
        if(idx==str.length()){
        System.out.println(newString);
        return ;
        }

        //step 1 convert the str into lenght
        char current=str.charAt(idx);
        //step 2 to find wheather a wants to move to sequence or not if yes this is the step
        calc(str, idx+1, newString+current);
        //step 3 else
            calc(str, idx+1, newString);
    }

    public static void main(String[] args) {
        String str="abc";
        calc(str, 0, "");

        
    }

    
}
