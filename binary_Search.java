package Sortings;

public class binary_Search {
    public static int bsearch(int arr[],int key)
    {
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==key)
                return mid;
            if(key>arr[mid]){
                l=mid+1;
            }
            else {
                r = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,6,7,11};
        int n=arr.length;
        int key=7;
        int ans=bsearch(arr,key);
        System.out.println(ans);
    }
}
