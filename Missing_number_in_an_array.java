public class Missing_number_in_an_array
{
    public static void main(String[] args)
    {
        // array should not contains any duplicates
        // arrays may or may not be in sorted order

        int[] arr={1,2,3,4,6};
        int n=arr.length;
        int sum=0;
        for (int i=0;i>=arr.length-1;i++)
        {
            sum=sum+arr[i];
        }
        int sum2=(n*(n+1))/2;
        System.out.println("Missing number is : "+(sum2-sum));
    }
}
