package GFG;

public class SortArrayThreeTypeElement {
    public static void segregateThreeType1(int [] arr){  //GFG Naive
        int [] temp = new int [arr.length];
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==0){
                temp[i]= arr[j];
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]==1){
                temp[i]= arr[j];
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]==2){
                temp[i]= arr[j];
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            arr[j]=temp[j];
        }
    }

    public static void segregateThreeType2(int [] arr){ //Dutch Nation Flag Element
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(mid<=high){
           if(arr[mid]==0){
               swap(arr,low,mid);
               low++;
               mid++;
           }else if(arr[mid]==1){
               mid++;
           }else{
               swap(arr,mid,high);
               high--;
           }
        }
    }

    static void swap(int [] arr, int i , int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    public static void printArray(int [] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String [] args){
        int [] arr1={0,1,0,0,2,1,2};
        segregateThreeType1(arr1);
        printArray(arr1);

        int [] arr2={0,1,2,1,1,2};
        segregateThreeType2(arr2);
        printArray(arr2);
    }
}
