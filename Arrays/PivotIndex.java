package Arrays;
public class PivotIndex {

    public int findPivot(int[] nums){
        int left=0;
        int right=0;
        for(int num:nums){
            right =right+num;
        }
        for(int i=0;i<nums.length;i++){
            right =right-nums[i];
            if(left == right){
                return i;
            }else{
                left=left+nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[]={1,7,3,6,5,6};
        PivotIndex s= new PivotIndex();
        int result =s.findPivot(nums);
        System.out.println(result);
        
    }
    
}
