import java.util.*;

class logicbuilding {

  public int findPivot(int[] nums){
    int left=0;
    int right=0;
    for(int num:nums){
        left += num;
    }
    for(int i=0;i<nums.length;i++){
        left =left - nums[i];
        if(right == left){
            return i;
        }else{
            right += nums[i];
        }
    }
   
    return -1;
    

  }

    public static void main(String[] args) {
        int nums[]={1,7,3,6,5,6};
        logicbuilding s= new logicbuilding();
        int res=s.findPivot(nums);
        System.out.println(res);
       
    }
}
