
public class Majority {

    public static int check(int[] nums){
    //     Map<Integer,Integer> map=new HashMap<>();
    //     for(int i=0;i<nums.length;i++){
    //         if(map.containsKey(nums[i])){
    //             map.put(nums[i],map.get(nums[i])+1);

    //         }else{
    //             map.put(nums[i],1);
    //         }
    //           if (map.get(nums[i]) > nums.length/ 2) {
    //             return nums[i];
    //         }
    //     }
    //     return -1;
    // }

    int result = 0;
    int count=0;
    for(int num : nums){
        if(count==0){
            result =num; 
        }
        if(result==num){
            count++;
        }
      count --;
      
    }
    return result;
}





    public static void main(String[] args) {

        int nums[]={2,2,1,1,1,2,2};

        System.out.println(check(nums));
        
    }
    
}
