package GFG;
import java.util.*;

class Point2{  //Point Object
    int x;
    int y;
    Point2(int x, int y){
        this.x=x;
        this.y=y;
    }
}

class MyCmp1 implements Comparator<Point2>{   //MyCmp class implement Comparator and use method within the class to sort
    public int compare(Point2 p1,Point2 p2){
        return p1.x-p2.x;
    }
}

public class SortArrayOfPoint2 {
    public static void main(String [] args){
        Point2  [] arr4 = {new Point2(10,20), new Point2(3,12), new Point2(5,7)};

        Arrays.sort(arr4,new MyCmp1());
        for(int i=0;i<arr4.length;i++){
            System.out.println(arr4[i].x + ","+arr4[i].y);
        }
    }
}
