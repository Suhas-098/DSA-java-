import java.util.*;
public class UsingSet {

    public static boolean printOutPut(Integer arr[]){
     
        Set<Integer> check = new HashSet<>(Arrays.asList(arr));
         if(arr.length != check.size()){
            return false;
         }
       return true;
    }
    

    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,1};
        System.out.print(printOutPut(arr));
        
    }
    
}
