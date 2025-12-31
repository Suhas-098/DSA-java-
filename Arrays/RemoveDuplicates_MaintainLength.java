package Arrays;
import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Set;


public class RemoveDuplicates_MaintainLength {

    public int removeDuplicate(int[] nums){

        //to just find the duplicate while maintaing the length but its kinda messy
    //     Set<Integer>set = new HashSet<>();
    //     for(int i=0;i<nums.length;i++){
    //         if(set.contains(nums[i])){
    //             nums[i]=-1;
    //         }else{
    //             set.add(nums[i]);     
    //         }
    //     }
    //   System.out.println(Arrays.toString(nums));

    //this is uisng 2-pointer approach
    int k=1;
     
    for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            nums[k]=nums[i];
            k++;
        }
    }

    for(int i=k;i<nums.length;i++){
        nums[i] = -1;
    }
    return k;
       

    }

    public static void main(String[] args){

        int nums[] ={1,1,2,2,3,4,4,5,5};
        
        RemoveDuplicates_MaintainLength s = new RemoveDuplicates_MaintainLength();

         System.out.println(s.removeDuplicate(nums));
          System.out.println(Arrays.toString(nums));


    }
    
}
