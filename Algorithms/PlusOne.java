public class PlusOne {

    public static int[] checkSum(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            // System.out.println(arr[i]);
            if(arr[i]<9){
                arr[i]++;
                 return arr;
                
            }else{
                arr[i]=0;
            }
        }
         int newArr[] = new int[arr.length + 1];
        newArr[0] = 1;
        return newArr;
       
    } 
    

    public static void main(String[] args) {
        int arr[]={9,9,9};

         for (int x : checkSum(arr)) {
            System.out.print(x + " ");
        }
        
    }
    
}
