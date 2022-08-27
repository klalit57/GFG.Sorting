package GFG;

public class BubbleSort {
    public static void bubbleSort1(int [] arr){  //Not Optimised

        for(int i=0;i<arr.length-1;i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr,j,j+1);
                }
            }
        }
    }

    static void swap(int [] arr, int i , int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }

    public static void bubbleSort2(int [] arr){  //Optimised Bubble Sort
        for(int i=0;i<arr.length-1;i++) {
            boolean swapped=false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr,j,j+1);
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }

    public static void main(String [] args){
        int [] arr= {2,10,8,7};


        bubbleSort1(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

        int [] arr2= {3,5,10,20,40};

        System.out.println();
        bubbleSort2(arr2);
        for(int i=0;i<arr2.length;i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
