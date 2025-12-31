//Problem Statement
// You are given an array nums containing distinct integers in the range 1 to 200.

// The array contains exactly 199 numbers

// All numbers from 1 to 200 appear once, except one number which is missing

// Your task is to find and return the missing number.

// example nums = [1, 2, 3, 4, 6, 7, ..., 200] output: 5;

package Arrays;



public class MissingNumber {

    public static int findMissing(int nums[]){
        //this is using Arithmetic approach using sum formula which is to find the sum n*n+1/2

    //   int n=9;
    //   int sum=n*(n+1)/2;
    //   int x=0;
    //   for(int i=0;i<nums.length;i++){
    //    x += nums[i];
    //   }
    //   return sum - x;

    //HashMap approach

    // Map<Integer,Boolean>map= new HashMap<>();
    //  int n = 9;
    // for(int i=0;i<nums.length;i++){
    //   map.put(nums[i],true);
    // }
    // for(int i=1;i<=n;i++){
    //     if(!map.containsKey(i)){
    //       return i;
    //     }
    // }return -1;


    //Best optimal approach using XOR 
    int n=nums.length+1;
    int XOR= 0;

    for(int i=0;i<=n;i++){
        XOR ^= i;
    }

    for(int num:nums){
        XOR ^= num;
    }
    return XOR;


    }

    public static void main(String[] args) {
        int[] nums={1, 2, 3, 4, 5, 7, 8, 9};
        System.out.println(findMissing(nums));
    }
    
}
