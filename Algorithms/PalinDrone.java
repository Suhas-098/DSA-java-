// public class PalinDrone {

//     public static boolean check(int num){
//         String sc=Integer.toString(num);//convert the int to string
//      boolean isPalindrome=true;//at first lets assume its true
//      for(int i=0;i<sc.length()/2;i++){
//         if(sc.charAt(i)!=sc.charAt(sc.length()-1-i)){
//             isPalindrome=false;
//             break;

//         }
//      }
//      return isPalindrome;

//     }
//     public static void main(String[] args){

//         int num=12212;
//         System.out.println(check(num));

//     }
    
// }
public class PalinDrone {

    public static boolean check(int num){
        int reversedNumber=0;
        int digitsLeft=num;
        while(digitsLeft>0){
            int result =digitsLeft%10;
            digitsLeft=(int)Math.floor(digitsLeft/10);
            reversedNumber=reversedNumber*10+result;
        }
        return num==reversedNumber;
  

    }
    public static void main(String[] args){

        int num=12213;
        System.out.println(check(num));

    }
    
}