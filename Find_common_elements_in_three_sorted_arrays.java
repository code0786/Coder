public class Find_common_elements_in_three_sorted_arrays
{
    public static void main(String[] args)
    {

        int[] arr={23,4,56,67,8,5,64,5};
        int [] arr2={34,56,8,45,3,2,6,4};
        int[] arr3={12,23,45,5,6,778,34,8,4};
        for(int i=0;i<arr.length-1;i++)
        {
            for (int j=0;j<arr2.length-1;j++)
            {
                for (int k=0;i<arr3.length-1;k++)
                {
                   if (arr[i]==arr2[j] && arr2[j]==arr3[k])
                   {
                       System.out.println(arr[i]);
                   }
                }
            }
        }

    }

}
