public class Extract_even_and_odd_numbers_from_an_array
{
    public static void main(String[] args)
    {
        int [] arr={1,2,3,4,5,67,8,9};

       // for (int i=0;i<arr.length-1;i++)
        //{
            /*
            if(arr[i]%2==0)
            {
                System.out.println("the even numbers are \n"+arr[i]);

            }

             */
            /*
            if (arr[i]%2!=0)
            {
                System.out.println("the odd numbers are :\n"+ arr[i]);
            }

             */

            // using for each loop

            for (int value : arr)
            {
                if (value%2==0)
                {
                    System.out.println(value);
                }
            }
        }

    }
//}
