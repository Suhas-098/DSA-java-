public class factorialusingrecursion {
    
    public static int printFactorial(int arr[]){
    //  if(n==1 || n==0){
    //     return 1;
    //  }
    //  int a=printFactorial(n-1);
    //  int b=n*a;
    //  return b;
    for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]);
         
        }

        return 1;
    }
    public static void main(String[] args) {
        // int n=10;
        // int an=printFactorial(n);
        // System.out.println(an);
        int arr[]={1,7,3,6,5,6};
        System.out.println(printFactorial(arr));
    }
    
}
