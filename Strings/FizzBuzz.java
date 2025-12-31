package Strings;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> findFizzBuzz(int x) {
        List<String> result = new ArrayList<>();
     for(int i=1;i<=x;i++){
     
        if(i % 3 == 0 && i % 5 == 0){
           result.add("FizzBuzz");
        }
        else if(i % 3 == 0 ){
         result.add("Fizz");
        }
        else if(i % 5 == 0){
          result.add("Buzz");
        }else{
            result.add(String.valueOf(i));
        }
     }
     return result;
    
}

public static void main(String[] args) {
    int x=15;
    FizzBuzz s= new FizzBuzz();
    System.out.println(s.findFizzBuzz(x));
}
}