package GFG;

import java.util.Arrays;
import java.util.Collections;

class Point1 implements Comparable<Point1> {  //Objects of Array & Comparable interface implement to compare within point class itself
    int x;
    int y;
    Point1(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int compareTo(Point1 p){
        return this.x- p.x;  //x portion of the point compared
                             //subtract other from current from other
    }
}

public class SortArrayOfPoint {
    public static void main(String [] args){
        Point1  [] arr4 = {new Point1(10,20), new Point1(3,12), new Point1(5,7)}; //Non Primitive Array

        Arrays.sort(arr4);  //Sorting Nonprimitive type
        for(int i=0;i<arr4.length;i++) {
            System.out.println(arr4[i].x + "," + arr4[i].y);
        }

        System.out.println();
            Point1  [] arr5 = {new Point1(30,40), new Point1(50,50), new Point1(40,50)}; //Non Primitive Array

            Arrays.sort(arr5, Collections.reverseOrder());  //SortingNon primitive type,Reverse order
            for(int i=0;i<arr5.length;i++){
                System.out.println(arr5[i].x + ","+arr5[i].y);

            }
    }

}
