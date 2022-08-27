package GFG;

public class MergeSort {
    static void mergeSort(int []  arr, int low, int high){
        if(high>low){
            int mid=(low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    static void merge(int [] arr, int low , int mid , int high){ //gfg
        int n1=mid-low+1;
        int n2=high-mid;
        int [] left= new int[n1];
        int [] right= new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[mid+j+1];
        }
        int i=0; //left and a , i
        int j=0;  //right and b , j
        int k=low;   //arr  and k
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            } else{
                arr[k++]=right[j++];
            }
        }
        while(i<n1){
            arr[k++]=left[i++];
        }
        while(j<n2){
            arr[k++]=right[j++];
        }
    }

    public static void main(String [] args){

        int [] arr1={10,5,30,15,7};

        mergeSort(arr1,0 ,arr1.length-1);
        for(int x:arr1){
            System.out.print(x+" ");
        }
    }
}
