public class PivotIndex {

    public static int checkSum(int arr[]){
      
     int leftSum=0;
     int rightSum=0;
     for(int num : arr){
       rightSum +=num;
     }  

     for(int i=0;i<arr.length;i++){
        rightSum= rightSum-arr[i];
        if(leftSum == rightSum){
            return i;
        }else{
            leftSum=leftSum+arr[i];
        }
        
     }
     return -1;


       
    }

    public static void main(String[] args) {
        int arr[]={1,7,3,6,5,6};
        System.out.print(checkSum(arr));

    }
    
}
