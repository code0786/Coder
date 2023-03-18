public class Maximum_and_minimum_elements_in_array
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7,89,9};
        /*
        int max=arr[0];
        for (int i=1;i<=arr.length-1;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);

         */

        // similarly for the minimum we fix one minimum and then execute the same
        int min=arr[0];
        for (int i= 1;i<=arr.length-1;i++)
        {
            if (min>arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println(min);

    }
}
