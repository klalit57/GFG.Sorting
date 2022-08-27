package GFG;

public class QuickSortHoarePartition {

    public static void quickSortHoarePartition(int [] arr, int low, int high){
        if(low<high){
            int p=hoarsePartition(arr,low,high);
            quickSortHoarePartition(arr,low,p);
            quickSortHoarePartition(arr,p+1,high);
        }
    }

    static void swap(int [] arr, int i , int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public static int hoarsePartition(int [] arr, int low , int high){
        int pivot=arr[low];  //Lowest is pivot always
        int i=low-1;
        int j=high+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);

            do{
                j--;
            }while(arr[j]>pivot);

            if(i>=j){
                return j;
            }
            swap(arr,j,i);
        }
    }

    public static void printArray(int [] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String [] args){
        int [] arr1={8,4,7,9,3,10,5};
        quickSortHoarePartition(arr1,0,arr1.length-1);
        printArray(arr1);
    }
}
