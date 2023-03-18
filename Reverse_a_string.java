public class Reverse_a_string
{
    public static void main(String[] args)
    {
        String k="all is well";
        String rev="";

        /*
        for (int i=k.length()-1;i>=0;i--)
        {
            rev=rev+k.charAt(i);
        }
        System.out.println(rev);

         */

        // char array
/*
        char[] arr=k.toCharArray();
        for (int j= arr.length-1;j>=0;j--)
        {
            rev=rev+arr[j];
        }
        System.out.println(rev);

 */
        // using StringBuffer

        StringBuffer sb= new StringBuffer(k);
        System.out.println(sb.reverse());
    }
}
