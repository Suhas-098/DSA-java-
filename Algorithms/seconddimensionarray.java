import java.util.*;

public class seconddimensionarray {
   public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    int col=sc.nextInt();
    

    int[][]numbers=new int [rows][col];
for(int i=0;i<rows;i++){
    for(int j=0;j<col;j++){
numbers[i][j]=sc.nextInt();
    }
}
int x= sc.nextInt();
for(int i=0;i<rows;i++){
    for(int j=0;j<col;j++){
if(numbers[i][j]==x){
System.out.println(x+" found at:"+ i+","+j);
}

   }}
   }}