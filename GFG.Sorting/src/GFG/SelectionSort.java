package GFG;

public class SelectionSort {

    public static void selectionSort1(int [] arr){  //GFG Naive
        int [] temp =new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int minIndex=0;
            for(int j=1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]) {
                    minIndex=j;
                }
            }
            temp[i]=arr[minIndex];
            arr[minIndex]=Integer.MAX_VALUE;
        }
        for(int k=0;k<arr.length;k++){
            arr[k]=temp[k];
        }
    }

    public static void selectionSort2(int [] arr){  //GFG better approach
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]) {
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }

    public static void main(String [] args){
        int [] arr1={10,5,8,20,2,18};
        //selectionSort1(arr1);

        for(int i=0;i<arr1.length;i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        selectionSort2(arr1);
        for(int i=0;i<arr1.length;i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
