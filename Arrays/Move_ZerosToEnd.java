package Arrays;
import java.util.*;

class move_ZeroesToEnd {
    public static void moveZeroes(int[] nums) {
        int left=0;
      for(int i=0;i<nums.length;i++){
    if(nums[i]!=0){
        int temp=nums[left];
        nums[left]=nums[i];
        nums[i]=temp;
        left++;
        
    }
      }
           System.out.println(Arrays.toString(nums));
        }
        
    

    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
    }
}


//so basically what did i learn in this is that when u want to swap character u have swap the index 
// not the values example like int temp=left; left= nums[i]; nums[i]=temp this is just swapping the 
// values it does not change the values in the array so the correct way to swap the character is to 
// swap the index like int temp= nums[left] where left is 0 so the nums of index 0 .