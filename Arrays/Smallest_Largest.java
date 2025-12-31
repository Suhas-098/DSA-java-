package Arrays;
public class Smallest_Largest {

    public void findSmallest_Largest(int nums[]){
        if(nums == null || nums.length==0){
           throw new IllegalArgumentException("array should not be empty");
        }
        int smallest=nums[0];
        int largest = nums[0];
        for(int i=0;i<nums.length;i++){
            if(smallest > nums[i]){
                smallest = nums[i];
            }
            if(largest < nums[i]){
                largest = nums[i];
            } 
        }
       System.out.println("Smallest Number is:"+smallest);
        System.out.println("largest Number is:"+largest);
        
    }

    public static void main(String[] args) {

        int nums[]={2,3,4,1,5,6,7};

        Smallest_Largest s= new Smallest_Largest();

        s.findSmallest_Largest(nums);
        
        
        
    }
    
}
