package GFG;

import java.util.*;

public class CollectionsSort {  //Collection.sort use to sort list collection Ex-linkedList,Arraylist

    public static void main(String [] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(15);

        Collections.sort(list);   //Natural increasing order
        System.out.println(list);

        Collections.sort(list,Collections.reverseOrder());  //reverse Order
        System.out.println(list);

    }
}
