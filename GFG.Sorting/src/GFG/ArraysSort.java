package GFG;
import java.util.*;

public class ArraysSort {   //Arrays.sort() work for both Arrays of primitive and NonPrimitive data type
                            //for Primitive custom comparator not applicable-Only sort in increasing order
                            //for NonPrimitive custom comparator could be applicable
    public static void main(String [] args){
        int [] arr1= {5,20,12,30};
        char [] arr2={'b','b','a','c','a'};
        Arrays.sort(arr1);  //1.Sorting Whole Array primitive datattype
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


        int [] arr3= {5,30,20,10,8};
        Arrays.sort(arr3,1,4);  //2.Sorting subArray primitive datatype
        System.out.println(Arrays.toString(arr3));
    }
}
