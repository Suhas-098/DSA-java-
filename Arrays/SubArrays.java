package Arrays;

public class SubArrays {

    public void printSubArray(int nums[]){
        //Brute Force Approach O(n^3)

        // int maxsum=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int currSum=0;
        //     for(int j=i;j<nums.length;j++){
          
        //      currSum+=nums[j];
        //     maxsum=Math.max(currSum, maxsum);
        //     }
        // }
        // System.out.println(maxsum);

        //kadane's Alogorith
        int maxsum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum += nums[i];
            maxsum=Math.max(currSum, maxsum);
            if(currSum<0){
                currSum=0;
            }
        }
        System.out.println(maxsum);
        
    }

    public static void main(String[] args) {

        int[]nums={3,-4,5,4,-1,7,-8};

        SubArrays s= new SubArrays();

       s.printSubArray(nums);
        
        
    }
    
}
