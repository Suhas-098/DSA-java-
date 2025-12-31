
public class recursion1 {


public static void printNumbers(int i, int n, int sum ){
   if(i==n){
    sum += i;
    System.out.println(sum);
    return;
   }
   sum += i;
   printNumbers(i+1,n,sum);

}
    public static void main(String[] args) {
        
       
        printNumbers(1,5,0);
    }
}

















































// import java.util.*;
// public class recursion1 {


// public static void printNumbers(int n){
   
//     if(n==6){
//         return;
//     }
//  System.out.println(n);
//  printNumbers(n+1);

// }
//     public static void main(String[] args) {
//         int n=1;
       
//         printNumbers(n);
//     }
// }
