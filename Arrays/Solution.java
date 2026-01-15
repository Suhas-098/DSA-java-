package Arrays;
import java.util.*;

class Solution {
      public static void print() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println(ll);

        ll.addFirst(3);
        ll.addLast(0);
        System.out.println(ll);
    }

    public static void main(String[] args) {
        print();
    }
}