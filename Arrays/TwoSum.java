package Arrays;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] findSum(int[] nums, int target){
        //using brute force approach with time=O(n^2) and space=O(1)

        // for(int i=0;i<nums.length;i++){
        //     for(int j=1+i;j<nums.length;j++){
        //         if(nums[i]+nums[j] == target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{};


        //using hashmap approach which is optimal with time=O(n)and space=O(n)

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n =target-nums[i];
            if(map.containsKey(n)){
                return new int[]{map.get(n),i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};

    }

    public static void main(String[] args){

        int nums[]={2,5,1,4,6};
        int target=9;
        System.out.println(Arrays.toString(findSum(nums, target)));

    }
    
}
