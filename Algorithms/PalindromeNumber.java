import java.util.Scanner;

public class PalindromeNumber{
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();   // take number input
        sc.close();

        String s = Integer.toString(input); // convert number to string

        boolean isPalindrome = true; 

        // Compare characters from both ends
        for(int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println(input + " is a Palindrome");
        else
            System.out.println(input + " is not a Palindrome");
    }
}