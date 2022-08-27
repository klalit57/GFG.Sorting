  package GFG;

public class CountInversionsInArray {
    public static int countInversion(int [] arr){  //GFG Naive
        int count =0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    static int countInversion(int [] arr, int low, int high){
        int res=0;
        if(high>low){
            int mid=(low+high)/2;
            res+=countInversion(arr,low,mid);
            res+=countInversion(arr,mid+1,high);
            res+=countInversionAndMerge(arr,low,mid,high);
        }
        return res;
    }

    static int countInversionAndMerge(int [] arr, int low , int mid , int high){ //gfg
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
        int count=0;
        int i=0,j=0;
        int k=low;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                k++;
                i++;
            } else{
                arr[k]=right[j];
                k++;
                j++;
                count=count+(n1-i);
            }
        }
        while(i<n1){
            arr[k]=left[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k]=right[j];
            k++;
            j++;
        }
        return count;
    }

    public static void main(String [] args){
        int [] arr1={2,4,1,3,5};
        int [] arr2={10,20,30,40};
        int [] arr3={40,30,20,10};
        int [] arr4={2,5,8,11,3,6,9,13};

        System.out.println(countInversion(arr1));
        System.out.println(countInversion(arr2));
        System.out.println(countInversion(arr3));


        System.out.println(countInversion(arr1,0,4));
        System.out.println(countInversion(arr4,0,7));
    }
}
