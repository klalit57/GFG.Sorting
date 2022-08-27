package GFG;
import java.util.*;

public class UnionOfTWoSortedArray {
    public static void unionOfTwoSortedArray1(int  [] a , int [] b){  //GFG Efficient
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(j>0 && b[j]==b[j-1]){
                j++;
                continue;
            }
            if(a[i]<b[j]){
                System.out.print(a[i]+" ");
                i++;
            }else if(a[i]>b[j]){
                System.out.print(b[j]+" ");
                j++;
            }else if(a[i]==b[j]){
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
        while(i<a.length){
            if(i>0 && a[i]!=a[i-1]) {
                System.out.print(a[i] + " ");
            }
                i++;
        }
        while(j<b.length){
            if(j>0 && b[j]!=b[j-1]){
                System.out.print(b[j] + " ");
            }
            j++;
        }
        System.out.println();
    }

    public static void unionOfTwoSortedArray2(int [] a, int [] b){ //GFG Naive
        int l=a.length+b.length;
        int [] c= new int[l];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int j=0;j<b.length;j++){
            c[a.length+j]=b[j];
        }
        Arrays.sort(c);
        for(int k=0;k<l;k++){
            if(k==0 || c[k]!=c[k-1]){
                System.out.print(c[k]+" ");
            }
        }
        System.out.println();
    }
    public static void main(String [] args){
        int [] a={3,5,10,10,10,15,15,20};
        int [] b={5,10,10,15,30};

        int [] x={1,1,3,3,3};
        int [] y={1,1,1,1,3,5,7};

        unionOfTwoSortedArray1(a,b);
        unionOfTwoSortedArray1(x,y);

       // unionOfTwoSortedArray2(a,b);
        // unionOfTwoSortedArray2(x,y);

    }
}
