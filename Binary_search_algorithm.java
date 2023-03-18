import java.util.Arrays;
public class Binary_search_algorithm
{
    public static void main(String[] args)
    {
        // for binary search elements must be in sorted order
        int[] arr={1,2,3,4,5,6,7,8,9};
        int key=70;
        boolean flag=false;
        int l=arr[0];
        int hih=arr.length-1;
        while(l<=hih)
        {

            int mid=(l+hih)/2;
            if(key==mid)
            {
                System.out.println("element found at position : " + mid);
                flag=true;
                break;
            }
            if(key>mid)
            {
                l=l=mid+1;
            }
            if (key<mid)
            {
                hih=mid-1;
            }
        }
//        if (flag==true)
//        {
//            System.out.println("Element found\n");
//        }
//        else
//        {
//            System.out.println("Element found\n");
//        }
    }
}


