package Sortings;

public class quickSort {
    public static void swap(int arr[] ,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition(int arr[],int l,int h)
    {
        int pivot=arr[l];
        int i=l;
        int j=h;
        while(i<j)
        {
            while(arr[i]<=pivot) i++; //if element is smaller increase i
            while(arr[j]>pivot)j--;  //if element is greater decrease j
            if(i<j)
                swap(arr,i,j); // after i and get stop swap them if i<j
        }
        swap(arr,j,l);
        return j;
    }
    public static void Quick(int arr[],int l,int h)
    {
        if(l<h) {                    //if two element are present then only go in
            int pivot = partition(arr, l, h);
            Quick(arr, l, pivot - 1);
            Quick(arr, pivot + 1, h);
        }

    }
    public static void main(String[] args) {
        int arr[]={4,6,2,5,7,9,1,3};
        int l=0;
        int h=arr.length-1;
        Quick(arr,l,h);
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
}
