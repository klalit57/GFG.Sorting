package GFG;
import java.util.*;
import java.lang.*;

class Point3 implements Comparable<Point3>{  //Comparable and Comparator are different
    int x;
    int y;
    Point3(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int compareTo(Point3 p){
        return this.x-p.x;
    }
}

public class CollectionSortCustomComparable {
    public static void main(String [] args){
        List<Point3>  list = new ArrayList<Point3>();

        list.add(new Point3(5,10));
        list.add(new Point3(2,20));
        list.add(new Point3(10,30));

        Collections.sort(list);

        for(Point3 p:list){
            System.out.println(p.x+","+p.y);
        }

    }
}
