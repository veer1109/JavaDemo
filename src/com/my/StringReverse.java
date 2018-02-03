package com.my;
import java.lang.reflect.Array;
import java.util.*;

public class StringReverse {
    public  static void main(String[]arg)
    {
        String my = "My name is veer";
        String[] arr= my.split("\\s+");
        List<String> mylist = new ArrayList<>();

//       for(int i= arr.length-1; i>=0;i--)
//       {
//          System.out.println(arr[i].toString());
//       }

        Deque que = new LinkedList<>(Arrays.asList(arr));
       Iterator iterator = que.descendingIterator();
       while (iterator.hasNext())
       {
           System.out.println(iterator.next());
       }

    }
}
