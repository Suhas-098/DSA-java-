package Arrays;

// import java.util.HashMap;
// import java.util.Map;

public class MajorityElement {

    public static int findMajority(int nums[]){
        int result=0;
        int count=0;
        for(int num:nums){
          if(count==0){
            result=num;
          }
          if(result==num){
            count++;
          }else{
            count--;
          }
        }
        return result;

       //using hashmap

        // Map<Integer,Integer>map= new HashMap<>();
        // for(int num:nums){
        //     if(map.containsKey(num)){
        //         int oldCount=map.get(num);
        //         map.put(num,oldCount + 1);
        //     }else{
        //         map.put(num, 1);
        //     }

        //     for(int key:map.keySet()){
        //         int count =map.get(key);

        //         if(count>nums.length/2){
        //             return key;
        //         }
        //     }
        // }
        // return -1;
     
    }

    public static void main(String[] args) {
        int[] nums={1,3,2,2,3,1,3,2,2};

        System.out.println(findMajority(nums));
        
    }
    
}
