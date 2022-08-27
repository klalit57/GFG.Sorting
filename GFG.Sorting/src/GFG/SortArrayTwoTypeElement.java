package GFG;

public class SortArrayTwoTypeElement {
    public static void segregatePositiveNegative1(int [] arr){ //MyCode
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            while(arr[i]<0){
                i++;
            }
            while(arr[j]>0){
               j--;
            }
        }
    }

    public static void segregatePositiveNegative2(int [] arr){ //GFG Naive
        int [] temp= new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) {
                temp[index] = arr[i];
                index++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]>=0) {
                temp[index] = arr[j];
                index++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
    }

    public static void segregatePositiveNegative3(int [] arr){ //GFG Efficient
        int i=-1;
        int j=arr.length;
        while(true){
            do{
                i++;
            }while(arr[i]<0);

            do {
                j--;
            }while(arr[j]>=0);

            if(i>=j){
                return;
            }
            swap(arr,i,j);
        }
    }

    public static void printArray(int [] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static void swap(int [] arr, int i , int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    public static void main(String [] args){

        int [] arr1={13,-12,18,-10};
        segregatePositiveNegative2(arr1);
        printArray(arr1);

        int [] arr2={13,-10,18,-5,15,35,-4,8,-6};
        segregatePositiveNegative1(arr2);
        printArray(arr2);

        int [] arr3={13,-10,18,-5,15,35,-4,8,-6};
        segregatePositiveNegative3(arr3);
        printArray(arr3);

    }
}
