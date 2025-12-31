import java.util.*;

public class reversestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // StringBuilder sc=new StringBuilder();
        String name=sc.next();
        
        for(int i=name.length()-1;i>=0;i--){
        System.out.print(name.charAt(i));
        }
    }
}
