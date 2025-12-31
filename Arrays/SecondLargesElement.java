package Arrays;

public class SecondLargesElement {

    public int findSecondLargest(int nums[]){

        if(nums == null || nums.length<2){
           throw new IllegalArgumentException("array should have at least two elements");
        }
       
        int largest=nums[0];
        int secondLargest=nums[1];
        for(int i=2;i<nums.length;i++){
            if(largest<nums[i]){
                secondLargest = largest;
                largest=nums[i];
            }
            if(nums[i]<largest && nums[i]>secondLargest){
                secondLargest=nums[i];
            }
            
        }
        return secondLargest;
        
    }

    public static void main(String[] args) {

        int nums[]={2,1,4,3,5,6,7};
        SecondLargesElement s = new SecondLargesElement();
        System.out.println(s.findSecondLargest(nums));
        
    }
    
}
