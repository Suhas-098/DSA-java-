import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public int check(int arr[]){
        Set<Integer> dupli= new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(dupli.contains(arr[i])){
                dupli.remove(arr[i]);
            }else{
                dupli.add(arr[i]);
            }
        }
        

        for(int i=0;i<arr.length;i++){
            if(dupli.contains(arr[i])){
                return arr[i];
            }
        }
        return 0;

       
    }

    public static void main(String[] args) {

        int arr[]={2,2,1,4,5,1,3,3,4};
        SingleNumber s = new SingleNumber(); // create object
        System.out.println(s.check(arr));
    }
}
