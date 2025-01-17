import java.io.*;

class BinarySearch{
    int bS(int arr[],int l, int r, int x){
        if ( r <= l){
            int mid = l + (r + l) / 2;
            if(arr[mid] == x){
                return mid;
            }
            if(arr[mid] > x){
                return bS(arr, l,mid - 1, x);
            }
            return bS(arr,mid + 1,r,x);
        }
        return -1;
    }
    public static void main(String args[]){
        BinarySearch ob = new BinarySearch();
        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = ob.bS(arr,0,n-1,x);
        if (result == -1){
            System.out.println("Element is not present in Array");
        }else{
            System.out.println("Element is present at"+"index"+result);
        }
    }
    
}