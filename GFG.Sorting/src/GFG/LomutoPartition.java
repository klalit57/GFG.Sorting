package GFG;

public class LomutoPartition {
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
                //int temp=arr[j];
                //arr[j]=arr[i];
                //arr[i]=temp;
                swap(arr,i,j);
            }
        }
        //int temp=arr[pivot];
        //arr[pivot]=arr[i+1];
        //arr[i+1]=temp;
        swap(arr,i+1,pivot);
        return i+1;
    }

    public static int lomutoPartitionGivePivot(int [] arr, int low, int high, int pivot){
         //if pivot element index given swap it with last element and do std lomutoPartion
        //int temp=arr[pivot];
        //arr[pivot]=arr[high];
        //arr[high]=temp;
        swap(arr,pivot,high);

        return lomutoPartition(arr,low,high);
    }

    public static void printArray(int [] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int [] arr1={10,80,30,90,40,50,70};
        System.out.println(lomutoPartition(arr1,0,arr1.length-1));
        printArray(arr1);

        int [] arr2={70,60,80,40,30};
        System.out.println(lomutoPartition(arr2,0,arr2.length-1));
        printArray(arr2);

        int [] arr3={30,40,20,50,80};
        System.out.println(lomutoPartition(arr3,0,arr3.length-1));
        printArray(arr3);

        int [] arr4={50,30,20,10,5,11};
        System.out.println(lomutoPartitionGivePivot(arr4,0,5,2)); //Lomuto with given Partion
        printArray(arr4);
    }
}
