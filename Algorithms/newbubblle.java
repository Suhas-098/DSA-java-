
public class newbubblle {
    public static void bubble (int arr[]) {
        for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
        }
    }
public static void main(String[] args) {
   int arr[]={7,8,1,4,9,5,6,3,2};
for(int i=0;i<arr.length-1;i++){
   
    for(int j=0;j<arr.length-1-i;j++){
       if(arr[j]>arr[j+1]){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
       }
    }
}
bubble(arr);
}


}





