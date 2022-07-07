package Sortings;

public class merge_sort2 {
    public static int[] merge(int arr[],int l,int mid,int r) {
        int[] brr = new int[arr.length];
        int i = l;
        int j = mid + 1;
        int k = l;
        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                brr[k] = arr[i];
                i++;
            } else {
                brr[k] = arr[j];
                j++;
            }
            k++;
        }
        if (i > mid) {
            while (j <= r) {
                brr[k++] = arr[j++];
            }
        } else {
            while (i <= mid) {
                brr[k++] = arr[i++];
            }
        }
        for (k = l; k <= r; k++)
        {
            arr[k]=brr[k];
        }
        return arr;
    }
    public static int[] divide(int arr[],int l,int r)
    {
        int []ans=new int[arr.length];
        if(l<r)     //atleast two element should present
        {
            int mid=(l+r)/2;
            divide(arr,l,mid);   //divide arr into 2 part
            divide(arr,mid+1,r);
           ans= merge(arr,l,mid,r);  // merge two arr in sorted format
        }
       return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,3,4,8,6,9,10};
        int res[];
        int l=0;
        int r=arr.length-1;
        res=divide(arr,l,r);
        for(int a:res)
        {
            System.out.print(a+" ");
        }

    }
}
