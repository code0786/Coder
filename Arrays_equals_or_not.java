import java.util.Arrays;

public class Arrays_equals_or_not
{
    public static void main(String[] args)
    {
        // first approach is to use the built in method

        int[] arr={1,2,3,4,5,6};
        int[] are={1,2,3,5,6};
        /*
        boolean status=Arrays.equals(arr,are);
        if (status==true)
        {
            System.out.println("Arrays are equal");
        }
        else
            System.out.println("Arrays are not equal");

         */

        //second approach is to write the logic
        boolean status=true;
        if(arr.length==are.length)
        {
            for(int i=0;i<arr.length;i++)
            {
                if (arr[i]!=are[i])
                {
                    status=false;
                }
            }
        }

        else
        {
            status=false;
        }
        if (status==true)
        {
            System.out.println("Arrays are equal");
        }
        else
        {
            System.out.println("Arrays are not equal");
        }
    }
}
