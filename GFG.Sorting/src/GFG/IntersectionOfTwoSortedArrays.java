package GFG;

public class IntersectionOfTwoSortedArrays {
    public static void intersectionOfTwoSortedArrays1(int  [] a , int [] b){  //MyCode
        int i=0;
        int j=0;
        while(i<a.length-1&& j<b.length-1){
            if(a[i]<b[j]){
                i++;
            }
            if(a[i]>b[j]){
                j++;
            }
            if(a[i]==b[j]){
                System.out.print(a[i]+" ");
                while(j<b.length && a[i]==b[j]) {
                    j++;
                }
                while(i<a.length && a[i]==b[j-1] ) {
                    i++;
                }
            }
        }
        System.out.println();
    }

    public static void intersectionOfTwoSortedArrays2(int  [] a , int [] b){  //GFG Naive
        for(int i=0;i<a.length;i++){
            if(i>0 && a[i]==a[i-1]){
                continue;
            }
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
        System.out.println();
    }

    public static void intersectionOfTwoSortedArrays3(int  [] a , int [] b){  //GFG Efficient
        int i=0;
        int j=0;
        while(i<a.length-1 && j<b.length-1){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(a[i]<b[j]){
                i++;
            }else if(a[i]>b[j]){
                j++;
            }
            if(a[i]==b[j]){
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
        System.out.println();
    }



    public static void main(String [] args){
        int [] a={3,5,10,10,10,15,15,20};
        int [] b={5,10,10,15,30};

        intersectionOfTwoSortedArrays1(a,b);
        intersectionOfTwoSortedArrays2(a,b);


        int [] x={1,1,3,3,3};
        int [] y={1,1,1,1,3,5,7};

        intersectionOfTwoSortedArrays1(x,y);
        intersectionOfTwoSortedArrays2(x,y);

        intersectionOfTwoSortedArrays3(a,b);
        intersectionOfTwoSortedArrays3(x,y);
    }
}
