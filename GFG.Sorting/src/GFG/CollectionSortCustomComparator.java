package GFG;

import java.util.*;
import java.util.Collections;

class Point4 {  //Comparable and Comparator are different
    int x;
    int y;
    Point4(int x,int y){
        this.x=x;
        this.y=y;
    }
}

class MyCmp3 implements Comparator<Point4>{
    public int compare(Point4 p1, Point4 p2){
        return p1.x-p2.x;
    }
}

public class CollectionSortCustomComparator {

    public static void main(String [] args){

         List<Point4> list = new ArrayList<Point4>();

        list.add(new Point4(5,10));
        list.add(new Point4(2,20));
        list.add(new Point4(10,30));

        Collections.sort(list,new MyCmp3());
        for(Point4 p:list){
            System.out.println(p.x+","+p.y);
        }

    }
}
