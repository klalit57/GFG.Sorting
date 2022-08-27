package GFG;

public class QuickSortLomutoPartition {

    public static void quickSortLomutoPartion(int [] arr , int low, int high){
        if(low<high){
            int p=lomutoPartition(arr,low,high);
            quickSortLomutoPartion(arr,low,p-1);
            quickSortLomutoPartion(arr,p+1,high);
        }
    }

    static void swap(int [] arr, int i , int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    public static int lomutoPartition(int [] arr, int low, int high){
        int pivot=high; //Last is always pivoted
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(arr[j]<arr[pivot]){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,pivot);
        return i+1;
    }

    public static void printArray(int [] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String [] args){

        int [] arr1= {8,4,7,9,3,10,5};
        quickSortLomutoPartion(arr1,0,arr1.length-1);
        printArray(arr1);

    }
}
