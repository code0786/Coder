public class Pairs_in_array_with_given_sum
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7,8};
        int sum=6,low=0,high= arr.length-1;
        while(low<high)
        {
            if (arr[low]+arr[high]<sum)
            {
                low++;
            }
            else if(arr[low]+arr[high]>sum)
            {
                high--;
            }
            else if (arr[low]+arr[high]==sum)
            {
                System.out.println(arr[low]+" "+arr[high] );
                low++;
                high--;
            }
        }

    }
}
