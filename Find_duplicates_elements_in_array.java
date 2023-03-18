public class Find_duplicates_elements_in_array
{
    public static void main(String[] args)
    {
        int[] array={1,2,3,4,5,6,7,6,5};
        for (int i=0;i<array.length;i++)
        {
            for (int j=i+1;j<array.length;j++)
            {
                if (array[i]==array[j])
                {
                    System.out.println("The duplicates elements are: "+array[j]);

                }
            }
        }

    }
}
