public class PivotIndexBrute {

    public static int pivotIndex(int arr[]){
        for(int i=0;i<arr.length;i++){
            int leftSum=0;
            int rightSum=0;

            for(int left=0;left<i;left++){
                leftSum = leftSum+arr[left];
            }

            for(int right=i+1;right<arr.length;right++){
                rightSum += arr[right];
            }

            if(rightSum==leftSum){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(arr));
    }
    
}
