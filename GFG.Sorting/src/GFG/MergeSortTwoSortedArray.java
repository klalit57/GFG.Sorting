package GFG;
import java.util.*;

public class MergeSortTwoSortedArray {
    public static void mergeSortTwoSortedArray1(int [] a, int [] b){  //MyCode
        int l=a.length+b.length;
        int [] temp= new int[l];
        int x=0;
        int y=0;
        int i=0;
        while(x<a.length && y<b.length){
            if(a[x]<=b[y]){
                temp[i]=a[x];
                x++;
                i++;
            } else{
                temp[i]=b[y];
                y++;
                i++;
            }
        }
        while(x<a.length){
            temp[i]=a[x];
            x++;
            i++;
        }
        while(y<b.length){
            temp[i]=b[y];
            y++;
            i++;
        }
        for(int k=0;k<a.length+b.length;k++){
            System.out.print(temp[k]+" ");
        }
        System.out.println();
    }

    public static void mergeSortTwoSortedArray2(int [] a, int [] b){   //GFG Naive
        int [] temp= new int [a.length+b.length];

        for(int i=0;i<a.length;i++){
            temp[i]=a[i];
        }
        for(int j=0;j<b.length;j++){
            temp[a.length+j]=b[j];
        }
        Arrays.sort(temp);
        for(int k=0;k<a.length+b.length;k++){
            System.out.print(temp[k]+" ");
        }
        System.out.println();
    }

    public static void mergeSortTwoSortedArray3(int [] a, int [] b){  //gfg merge sort
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                System.out.print(a[i]+" ");
                i++;
            } else{
                System.out.print(b[j]+" ");
                j++;
            }
        }
        while(i<a.length){
            System.out.print(a[i]+" ");
            i++;
        }
        while(j<b.length){
            System.out.print(b[j]+" ");
            j++;
        }
        System.out.println();
    }
    public static void main(String [] args){
        int [] a={10,15,20};
        int [] b={5,6,6,15};

        mergeSortTwoSortedArray1(a,b);
        //mergeSortTwoSortedArray2(a,b);
        //mergeSortTwoSortedArray3(a,b);

        int [] y={10,15,20,20};
        int [] z={1,12};

        mergeSortTwoSortedArray1(y,z);
        //mergeSortTwoSortedArray2(y,z);
        //mergeSortTwoSortedArray3(y,z);


    }
}
