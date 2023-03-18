public class Linear_Search
{
    public static void main(String[] args)
    {
        int element=50;
        int[] arr={12,2,4,5,6,7,8};
        boolean flag=false;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==element)
            {
                System.out.println("Element has been found at position : " +i);
                flag=true;
                break;
            }
        }
        if (flag==false)
        {
            System.out.println("Element not found");
        }

    }
}
