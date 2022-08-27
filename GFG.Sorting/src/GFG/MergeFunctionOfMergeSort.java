package GFG;

public class MergeFunctionOfMergeSort {
    public static void merge(int [] arr, int low , int mid , int high){ //gfg
        int n1=mid-low+1;
        int n2=high-mid;
        int [] left= new int[n1];
        int [] right= new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+i+1];
        }
        int i=0; //left and a , i
        int j=0;  //right and b , j
        int k=low;   //arr  and k
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
                k++;
            } else{
                arr[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<left.length){
            arr[k]=left[i];
            k++;
            i++;
        }
        while(j<right.length){
            arr[k]=right[j];
            k++;
            j++;
        }
    }

    public static void main(String [] args){
        int [] arr1= {10,15,20,11,30};

        int low=0;
        int high=arr1.length-1;
        int mid=low+(high-low)/2;

        merge(arr1,low,mid,high);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

        //int [] arr2= {5,8,12,14,7};


    }
}
