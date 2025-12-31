
public class Duplicate {

    public static boolean check(int arr[], int k){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && (j-i)<=k ){
                    return true;
                }
            }
        }return false;
     
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,3};

       System.out.println(check(arr,2));


    }
    
}
