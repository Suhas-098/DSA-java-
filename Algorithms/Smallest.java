public class Smallest {

    public static int findSmallest(int nums[]){
        int smallNo=nums[0];
     for (int i = 1; i < nums.length; i++) {
            if (nums[i] > smallNo) {
                smallNo = nums[i];
            }
        }
        return smallNo;
    
    }
  

    public static void main(String[] args) {

        int nums[]={5,3,7,8,4,6,1};

        System.out.println(findSmallest(nums));
        
    }
    
}
