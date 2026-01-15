package Arrays;

public class RotateArray {

    public boolean rotate(String s, String goal ){
        if(s.length() != goal.length())return false;
        // return (s+s).contains(goal);
       String combine=s+s;
       if(combine.contains(goal))return true;
       else{
        return false;
       }
    }

    public static void main(String[] args) {
        String s="abcde";
        String goal="cdeab";
        RotateArray sc= new RotateArray();
        boolean res=sc.rotate(s, goal);
        System.out.println(res);

        
    }
    
}
