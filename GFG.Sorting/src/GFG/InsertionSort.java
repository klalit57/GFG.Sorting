package GFG;

public class InsertionSort {
    public static void insertionSort1(int [] arr) {
        for(int i = 1; i < arr.length; i++) {
            int key =arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                 j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String [] args){
        int [] arr1={10,5,8,20,2,18};
        insertionSort1(arr1);
        for(int i=0;i<arr1.length;i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
