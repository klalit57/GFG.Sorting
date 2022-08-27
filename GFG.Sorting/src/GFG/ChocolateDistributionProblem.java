package GFG;
public class ChocolateDistributionProblem {
    public static int chocolateDistributionProblem(int [] arr, int m){
        int low=0;
        int high=arr.length-1;
        if(m>arr.length){
            return -1;
        }
        quickSortLomuto(arr,low,high);
        int res=arr[m-1]-arr[0];
        for(int i=0;i+m-1<arr.length;i++){
            res=Math.min(res,arr[i+m-1]-arr[i]);
         }
        return res;
    }
    public static void quickSortLomuto(int [] arr, int low, int high){
        if(low<high){
            int p=lomutoPartition(arr,low,high);
            quickSortLomuto(arr,low,p-1);
            quickSortLomuto(arr,p+1,high);
        }
    }
    public static void swap(int [] arr, int i, int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public static int lomutoPartition(int [] arr , int low, int high){
        int i=low-1;
        int pivot=high;
        for(int j=low;j<=high;j++){
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
        int [] arr1= {7,3,2,4,9,12,56};
        System.out.println(chocolateDistributionProblem(arr1,4));
        printArray(arr1);
    }
}
