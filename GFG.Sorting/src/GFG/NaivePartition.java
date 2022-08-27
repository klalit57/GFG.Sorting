package GFG;

public class NaivePartition {

    public static int naivePartition(int [] arr, int low, int high, int pivot){
        int [] temp= new int[high-low+1];  //pivot is given
        int index=0;
        for(int i=low;i<=high;i++){
            if(arr[i]<arr[pivot]){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=low;i<=high;i++){
            if(arr[i]==arr[pivot]){
                temp[index]=arr[i];
                index++;
            }
        }

        int res=low+index-1;

        for(int i=low;i<=high;i++){
            if(arr[i]>arr[pivot]){
                temp[index]=arr[i];
                index++;
            }
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
        return res;
    }

    public static void printArray(int [] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String [] args){
        int [] arr1 = {3,8,6,12,10,7};
        System.out.println(naivePartition(arr1,0, arr1.length-1,5));
        printArray(arr1);

        int [] arr2 = {5,3,12,8,5};
        System.out.println(naivePartition(arr2,0, arr2.length-1,0));
        printArray(arr2);
    }
}
