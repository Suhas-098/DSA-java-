import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Two2sum {

    public static int[] twosum(int[] nums, int target){

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int n = target-nums[i];
            if(map.containsKey(n)){
              return new int[]{map.get(n),i};
            }else{
                map.put(nums[i],i);
            }
        }

        return new int[]{};
    }
    
    public static void main(String[] args) {

        int nums[]={2,4,5,6,1};
        int target=7;

        // Two2sum s= new Two2sum();
    
        System.out.println(Arrays.toString(twosum(nums, target)));
        
    }
}
