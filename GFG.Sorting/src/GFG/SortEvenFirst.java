package GFG;

import java.util.*;

class MyCmp2 implements Comparator<Integer>{
    public int compare(Integer a,Integer b){
        return a%2-b%2;   //remainder 0 is preferred while sorting
    }
}

public class SortEvenFirst {
    public static void main(String [] args){
        Integer [] arr5={5,20,10,3,12};

        Arrays.sort(arr5,new MyCmp2());
        System.out.println(Arrays.toString(arr5));
    }
}
