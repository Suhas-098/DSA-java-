


public class BubbleSort{


    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
        }
    }
 public static void main(String[] args) {
    

    int arr[]={7,8,4,3,2,5,9};

    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                //swap 
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }
        }
    }
    bubbleSort(arr);
 }
}
 
















































// public static void bubbleSort(int[] arr){
//     for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]);
//     }
//  }

//     public static void main(String[] args) {
//         int arr[]={7,4,8,3,1,2,9,10,6};

//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;

//                 }
//             }
//         }bubbleSort(arr);
//     } 