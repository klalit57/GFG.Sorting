package GFG;

public class HoarePartition {
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
        int [] arr1={5,3,8,4,2,7,1,10};

        System.out.println(hoarsePartition(arr1,0,arr1.length-1));
        printArray(arr1);
    }
}
