public class Pallindrome_string
{
    public static void main(String[] args)
    {
        String fir="MADAM";
        String sec="";
        for (int i=fir.length()-1;i>=0;i--)
        {
            sec=sec+fir.charAt(i);
        }
        if (fir.equals(sec))
        {
            System.out.println("Pallindrome string");
        }
        else
        {
            System.out.println("Not a pallindrome string");
        }

    }
}
