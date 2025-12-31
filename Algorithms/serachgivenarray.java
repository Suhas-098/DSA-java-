import java.util.*;

public class serachgivenarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int giveNum =sc.nextInt();
        
        
int number[] =new int[giveNum];

  for(int i=0;i<giveNum;i++){
            number[i]=sc.nextInt();
        }

        int target=sc.nextInt();
        for(int i=0;i<number.length;i++){
           if(number[i] == target){
            System.out.println("target is at index"+ i);
           }
        }

      sc.close();
    }
}
