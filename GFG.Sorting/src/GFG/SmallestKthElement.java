package GFG;

public class SmallestKthElement {
    public static int smallestKthElement(int [] arr, int k){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int p=lomutoPartition(arr,low,high);
            if(p==k-1){
                return arr[p];
            }
            if(p<k-1){
                low=p+1;
            }else if(p>k-1){
                high=p-1;
            }
        }
        return -1;
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
            int [] arr1={30,20,5,10,8};

            System.out.println(smallestKthElement(arr1,3));
            printArray(arr1);

            int [] arr2={10,5,30,12};

            System.out.println(smallestKthElement(arr2,1));
            printArray(arr2);
        }
    }

