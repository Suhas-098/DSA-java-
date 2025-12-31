package Strings;

import java.util.Scanner;

public class Palindrome {
    public static boolean checkPalindrome(String name){
       
        for(int i=0;i<name.length()/2;i++){
            if(name.charAt(i)!=name.charAt(name.length()-1-i)){
           return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean result = checkPalindrome(name);
        System.out.println(result);
        sc.close();
    }
    
}
