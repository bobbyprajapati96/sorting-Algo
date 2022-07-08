package Sortings;

public class Bubble_Sort {
    static void swap(int arr[], int i,int j)
    {
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
    }
    static void printArr(int arr[])
    {
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={3,2,4,15,5,6};
        int n=arr.length;
        System.out.println("Before Sorting");
        printArr(arr);
        //Bubble Sort
        //Time Complexity = O(n^2)
        // Not so good for competitive programming
        for(int i=0;i<n-1;i++)
        {
            boolean isswap=false;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    isswap=true;
                    swap(arr,j,j+1);
                }
            }
        }
        //Similarly we can do for Descending Order also just by little change on line 28
//        for(int i=0;i<n-1;i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] < arr[j + 1]) {
//                    swap(j,j+1);
//                }
//            }
//        }
        System.out.println("\nAfter Sorting");
        printArr(arr);
    }
}
