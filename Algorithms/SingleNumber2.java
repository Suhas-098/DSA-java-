// import java.util.*;
public class SingleNumber2 {

    public Integer checkSum(int nums[]){
       int single=0;
        for(int i=0;i<nums.length;i++){

            single^=nums[i];

            
            
           
        }
        return single;
        
    }

    public static void main(String[] args) {
        
        int nums[]={1,2,2,7,1,5};
        SingleNumber2 s=new SingleNumber2();
       System.out.println(s.checkSum(nums));
    }
    
}

